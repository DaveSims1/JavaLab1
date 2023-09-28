public class Singers {
    //Instance Variables
    private int SingerID = 0;
    private String SingerName;
    private String SingerAddress;
    private String SingerBirth;
    private int AlbumNum = 0;


    //Constructor

    public Singers (int SingerID, String SingerName, String SingerAddress, String SingerBirth, int AlbumNum){
        this.SingerID = SingerID;
        this.SingerName = SingerName;
        this.SingerAddress = SingerAddress;
        this.SingerBirth = SingerBirth;
        this.AlbumNum = AlbumNum;
    }

    //Empty Constructor
    public Singers(){
    }

    //Setters & Getters

    //ID
    public int getID(){
        return SingerID;
    }
    public void setID(int newSingerID){
        this.SingerID = newSingerID;
    }

    //Name
    public String getSingerName(){
        return SingerName;
    }
    public void setSingerName(String newSingerName){
        this.SingerName = newSingerName;
    }

    //Address
    public String getSingerAddress(){
        return SingerAddress;
    }
    public void setSingerAddress(String newSingerAddress) {
        this.SingerAddress = newSingerAddress;
    }

    //Birth
    public String getSingerBirth(){
        return SingerBirth;
    }

    public void setSingerBirth(String newSingerBirth){
        this.SingerBirth = newSingerBirth;
    }

    //Album Numbers
    public int getAlbumNum(){
        return AlbumNum;
    }

    public void setAlbumNum(int newAlbumNum){
        this.AlbumNum = newAlbumNum;
    }

    //All at once
    public void setAll(int newSingerID, String newSingerName, String newSingerAddress, String newSingerBirth, int newAlbumNum){
        this.SingerID = newSingerID;
        this.SingerName = newSingerName;
        this.SingerAddress = newSingerAddress;
        this.SingerBirth = newSingerBirth;
        this.AlbumNum = newAlbumNum;
    }


    //Create several getters that would allow you to get the current individual values of each instance
    //variables of the Singer object

    //ID
    public int getCurrentID(){
        return this.SingerID;
    }
    public String getCurrentName(){
        return this.SingerName;
    }
    public String getCurrentAddress(){
        return this.SingerAddress;
    }
    public String getCurrentBirth(){
        return this.SingerBirth;
    }
    public int getCurrentAlbumNum(){
        return this.AlbumNum;
    }

    //Also create one display function that displays all instance variables of an object one call.

    public String toString(){
        return SingerID+", "+SingerName+", "+SingerAddress+", "+SingerBirth+", "+AlbumNum;
    }




























}
