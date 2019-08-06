var Chat = function() {

  var people = [];


  return { 
    talk: function(talker, listener, message) {
      if (people[listener.name]) {
        listener.listen(talker, message);
      } else {
        console.log(talker.name + ' to all -> ' + message);
      }
    },
    addPerson: function (person) {
      people[person.name] = person;
      person.chat = this;
    }
   }
}

// class Person {
//   constructor(name) {
//     var name = name;
//     var chat = null;
//   }
// }

var Person = function(name) {
  this.name = name;
  this.chat = null;
};

Person.prototype = {
  listen: function(talker, message) {
    console.log(talker.name + ' to ' + this.name + ' -> ' + message);
  },
  talk: function(person, message) {
    chat.talk(this, person, message);
  }
}


var debora = new Person('debora');
var matheus = new Person('matheus');
var deborah = new Person('deborah');
var chat = new Chat();
chat.addPerson(debora);
chat.addPerson(matheus);
matheus.talk(debora, 'hi debora');
debora.talk(matheus, 'hi matheus');
matheus.talk(deborah, 'nice to hear from you, deborah!');

