package com.ethiopic.android.anysoftkeyboard;

import com.anysoftkeyboard.keyboards.AnyKeyboard;
import com.anysoftkeyboard.keyboards.Keyboard;

import java.util.List;

/**
 * Created by User on 0008 7 8 2016.
 */
public class AmharicKeyboard {
    public boolean isAmharicAlphabetRange(Keyboard.Key key)
    {
        return ((key.label.hashCode()>=4608 && key.label.hashCode()<=4966)?true:false);
    }
    public void handleAmharicKeyLabel(Keyboard.Key key)
    {
        CharSequence label = key.label;


    }
    public boolean isAmharicRootLetter(AnyKeyboard.AnyKey key) {

        return(key.label.hashCode()%8==5)?true:false;

    }
    private static boolean isAmharicPunctuation(Keyboard.Key key)
    {
        return ((key.label.hashCode()>=4961 && key.label.hashCode()<=4966)?true:false);
    }
}
