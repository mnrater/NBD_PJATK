var map = function () {
    emit(this.job, {
      amountW: 1
    });
  };


var reduct = function (key, values) {
    var reducted = {
      amountW: 0
    };

    values.forEach(function (value) {
      reducted.amountW += value.amountW;
    });

    return reducted;
  };


db.people.mapReduce(map, reduct, {out: "result3"});
printjson(db.result3.find().sort({_id: 1}).toArray());