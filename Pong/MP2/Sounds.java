package Tutorial;

/**
 * Created by Danielle98 on 10/23/2016.
 */
import java.applet.Applet;
import java.applet.AudioClip;

public class Sounds {

    //AUDIO SOURCE http://www.wavsource.com/ 
    public static final AudioClip BALL = Applet.newAudioClip(Sounds.class.getResource("boing_spring.wav"));
    public static final AudioClip GAMEOVER = Applet.newAudioClip(Sounds.class.getResource("bloop_x.wav"));
    public static final AudioClip RESTART = Applet.newAudioClip(Sounds.class.getResource("applause2_x.wav"));
    public static final AudioClip GAMEAGAIN = Applet.newAudioClip(Sounds.class.getResource("fanfare_x.wav"));
}
