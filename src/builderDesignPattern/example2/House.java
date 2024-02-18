package builderDesignPattern.example2;

public class House {
    private int noOfRooms;
    private String roofType;
    private String parkingType;
    private String doorType;

    private House(Builder builder){
        this.noOfRooms = builder.noOfRooms;
        this.roofType = builder.roofType;
        this.parkingType = builder.parkingType;
        this.doorType = builder.doorType;
    }

    public static Builder getBuilder(){
        return new Builder();
    }
    static class Builder{
        private int noOfRooms;
        private String roofType;
        private String parkingType;
        private String doorType;

        public int getNoOfRooms() {
            return noOfRooms;
        }

        public Builder setNoOfRooms(int noOfRooms) {
            this.noOfRooms = noOfRooms;
            return this;
        }

        public String getRoofType() {
            return roofType;
        }

        public Builder setRoofType(String roofType) {
            this.roofType = roofType;
            return this;
        }

        public String getParkingType() {
            return parkingType;
        }

        public Builder setParkingType(String parkingType) {
            this.parkingType = parkingType;
            return this;
        }

        public String getDoorType() {
            return doorType;
        }

        public Builder setDoorType(String doorType) {
            this.doorType = doorType;
            return this;
        }

        public House build(){
            /*The essence of this method is it will have validations of the parameters*/
            try {
                if (this.noOfRooms <= 0) {
                    throw new Exception("No of rooms must be a positive number");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
                return null;
            }
            return new House(this);
        }
    }
}
