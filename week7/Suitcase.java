package week7;

import java.util.ArrayList;

public class Suitcase {

   private ArrayList<Thing> things;
   private int weightLimit;

    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
        this.things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing){
        int weightCurrent = 0;
        for (Thing currentThing:this.things){
            weightCurrent += currentThing.getWeight();
        }

        if (weightCurrent + thing.getWeight() <= this.weightLimit) {
            this.things.add(thing);
        }

    }

    @Override
    public String toString() {
        String languageControl = "";
        if(this.things.size() == 0) {
            languageControl =  "empty";
        } else if (this.things.size() == 1) {
            languageControl = this.things.size() + " thing";
        } else {
            languageControl = this.things.size() + " things";
        }
        return languageControl + " (" + this.totalWeight() + " kg)";
    }

    public void printThings(){
        for (Thing thing :this.things) {
            System.out.println(thing);
        }
    }

    public int totalWeight(){
        int weightCurrent = 0;
        for (Thing currentThing :this.things) {
            weightCurrent += currentThing.getWeight();
        }
        return weightCurrent;
    }

    public Thing heaviestThing(){
        Thing heaviest = new Thing("", 0);
      for (Thing thing : this.things) {
          if (thing.getWeight() > heaviest.getWeight()){
              heaviest = thing;
          }
      }

      if(this.things.size() == 0) return null;
      return heaviest;
    }

    public ArrayList<Thing> getThings() {
        return things;
    }
}
