package src.CHAPTER7;



        public class SafeSensor  {

            private double max;

            public SafeSensor(double max) {
                this.max = max;
                // calling the setPressure method of the parent class(Sensor)
            }

            public SafeSensor(double max,double pressure) {
                this.max = max;

            }

            // this method override the one on the superclass(Sensor).
            public boolean setPressure(double pressure) {
                if(pressure < 0 || pressure > max) {
                    System.out.println("Pressure can no be less than 0 or greater than "+this.max);
                    return false;
                }else {

                    return true;
                }


            }

}
