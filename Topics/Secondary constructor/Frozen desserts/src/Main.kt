// write the IceCreamOrder class here
  class IceCreamOrder {
       var price = 0
      private var scoops = 0
      private var toppings = 0
      private var popsicles = 0

    constructor (popsicles: Int) {
           this.popsicles = popsicles
            this.price = 7
      }

      constructor (scoops: Int, toppings: Int){
          this.scoops = scoops * 5
          this.toppings = toppings * 2
      }
  }
