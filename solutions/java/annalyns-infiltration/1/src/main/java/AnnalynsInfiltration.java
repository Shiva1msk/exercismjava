class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if(knightIsAwake){
            return false;
        }
        return true;
    }
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake&&archerIsAwake){
      return true;
  }
        
  if(!knightIsAwake&&archerIsAwake){
      return true;
  }
        if(!archerIsAwake&&knightIsAwake){
            return true;
        }
        if(prisonerIsAwake){
            return true;
        }
        return false;
            
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
if(!archerIsAwake&&prisonerIsAwake){
    return true;
}
        return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
     if(knightIsAwake&&!archerIsAwake&&petDogIsPresent){
         return true;
     }
        if(!petDogIsPresent&&prisonerIsAwake&&!knightIsAwake&&!archerIsAwake){
            return true;
        }
        if(petDogIsPresent&&!prisonerIsAwake&&!knightIsAwake&&!archerIsAwake){
            return true;
        }
if(petDogIsPresent&&prisonerIsAwake&&!knightIsAwake&&!archerIsAwake){
            return true;
        }
         if(petDogIsPresent&&prisonerIsAwake&&knightIsAwake&&archerIsAwake){
            return false;
        }
        
        return false;
    }
}
