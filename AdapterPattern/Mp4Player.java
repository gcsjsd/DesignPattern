public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName){

    }

    @Overridepublic void playMp4(String fileName){
        System.out.println("Playing mp4 file. Name"+ fileName);
    }
}