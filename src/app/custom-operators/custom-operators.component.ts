import { Component, OnInit } from '@angular/core';
import { Observable, of, Subscribable, Subscription } from 'rxjs';
import { map } from 'rxjs/operators';

@Component({
  selector: 'app-custom-operators',
  templateUrl: './custom-operators.component.html',
  styleUrls: ['./custom-operators.component.css']
})
export class CustomOperatorsComponent implements OnInit {

  constructor() { }

  numbersToOperate = [2, 5, 6];
  numbersOperated: number[];

  ngOnInit() {
    this.exponenciar(of(this.numbersToOperate));
  }

  exponenciar(numbersToOperate: Observable<number[]>) {
    numbersToOperate
      .pipe(
        pow(2),
        logArr2(),
      ).subscribe(arr => {
        this.numbersOperated = arr;
      });
  }
}


const pow = (expoente: number) => (source: Observable<number[]>) =>
  source.pipe(
    map(arr => arr.map(n => n ** expoente))
  );

export function logArr2<T, R>() {
  return (source: Observable<T>) => new Observable<R>(subscriber => {
    return source.subscribe({
      next: v => {
        console.log(v);
      },
      error: e => subscriber.error(e),
      complete: () => subscriber.complete()
    });
  });
}

const logArr3 = () => (source: Observable<number[]>) =>
  source.pipe(
    map(arr => arr.forEach(n => {
      console.log(n);
      return n;
    }))
  );

const logArr = () => map(x => {
  console.log(x);
  return x;
});
