package com.ethiopic.android.anysoftkeyboard;

import android.content.Context;

import com.anysoftkeyboard.addons.AddOn;
import com.anysoftkeyboard.keyboards.AnyKeyboard;
import com.menny.android.anysoftkeyboard.R;

/**
 * Created by User on 0021 5 21 2016.
 */
public class AmharicKeyboard1 extends AnyKeyboard {
    protected AmharicKeyboard1(AddOn keyboardAddOn, Context askContext, Context context,
                               int xmlLayoutResId) {
        // should use the package context for creating the layout
        super(keyboardAddOn,askContext, context, xmlLayoutResId, -1);
        // no generic rows in popup
    }

    @Override
    public String getDefaultDictionaryLocale() {
        return null;
    }

    @Override
   // public HashSet<Character> getSentenceSeparators() {
    public  char[] getSentenceSeparators() {
        return null;
    }
    //    return null;
   // }

    @Override
    public String getKeyboardName() {
        return "Amharic";
    }

    @Override
    public int getKeyboardIconResId() {
        return 0;
    }

    @Override
    public String getKeyboardPrefId() {
        return null;
    }
    @Override
    protected void setPopupKeyChars(Key aKey) {
        if ((aKey.codes != null) && (aKey.codes.length > 0)) {
            switch ((char) aKey.codes[0]) {
                case 'ቅ':
                    aKey.popupCharacters = "c\u0107\u010D";
                  // aKey.popupResId = com.menny.android.anysoftkeyboard.R.xml.popup_e;
                    aKey.popupResId = R.xml.popup_qwerty_e;
                    break;
                case 'ር':
                    aKey.popupCharacters = "d\u0111";
                    aKey.popupResId = R.xml.popup_qwerty_e;
                   // aKey.popupResId = com.menny.android.anysoftkeyboard.R.xml.popup_e;
                    break;
                case 'ት':
                    aKey.popupCharacters = "s\u015B\u0161";
                    aKey.popupResId = R.xml.popup_qwerty_e;
                    //aKey.popupResId = com.menny.android.anysoftkeyboard.R.xml.popup_e;
                    break;
                default:
                    super.setPopupKeyChars(aKey);
            }
        }
    }
}
