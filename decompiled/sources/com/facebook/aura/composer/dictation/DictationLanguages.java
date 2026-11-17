package com.facebook.aura.composer.dictation;

import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.BFI;
import X.BV5;
import X.C0881AGi;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.CFK;
import X.F0C;
import X.HxE;
import android.content.Context;
import android.icu.text.Transliterator;
import android.icu.util.ULocale;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.facebook.aura.network.AuraAcceptLanguage;
import java.lang.Character;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.IntPredicate;

/* loaded from: classes6.dex */
public final class DictationLanguages {
    public static final int $stable = 0;
    public static final String ENGLISH = "English";
    public static final int MAX_LANGUAGES = 3;
    public static final Map<String, String> MODEL_LANGUAGE_NAMES;
    public static final String TAG = "DictationLanguages";
    public static final DictationLanguages INSTANCE = new DictationLanguages();
    public static final Set<String> CANTONESE_REGIONS = C60O.A19("HK", "MO");
    public static final Set<Character.UnicodeScript> KANA = BFI.A0H(new Character.UnicodeScript[]{Character.UnicodeScript.HIRAGANA, Character.UnicodeScript.KATAKANA});
    public static final F0C simplifiedToTraditional$delegate = AbstractC5321DgF.A03(DictationLanguages$simplifiedToTraditional$2.INSTANCE);

    public final List<String> preferred(Context context) {
        C7384Etj.A0Y(context, 0);
        List<Locale> listUserLocales = userLocales(context);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<Locale> it = listUserLocales.iterator();
        while (it.hasNext()) {
            String strModelLanguageName = INSTANCE.modelLanguageName(it.next());
            if (strModelLanguageName != null) {
                arrayListA0h.add(strModelLanguageName);
            }
        }
        List<String> listA0a = AbstractC0878AGe.A0a(AbstractC0878AGe.A0X(AbstractC0878AGe.A0f(arrayListA0h)), 3);
        return C7384Etj.areEqual(listA0a, Collections.singletonList(ENGLISH)) ? C0881AGi.A00 : listA0a;
    }

    public final boolean prefersTraditionalChinese(Context context) {
        Locale next;
        C7384Etj.A0Y(context, 0);
        Iterator<Locale> it = userLocales(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if ("zh".equals(next.getLanguage())) {
                break;
            }
        }
        Locale locale = next;
        return "Hant".equals(locale != null ? ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript() : null);
    }

    public final String toTraditionalChinese(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.codePoints().anyMatch(new IntPredicate() { // from class: com.facebook.aura.composer.dictation.DictationLanguages.toTraditionalChinese.1
            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return DictationLanguages.KANA.contains(Character.UnicodeScript.of(i));
            }
        })) {
            return str;
        }
        String strTransliterate = ((Transliterator) simplifiedToTraditional$delegate.getValue()).transliterate(str);
        C7384Etj.A0U(strTransliterate);
        return strTransliterate;
    }

    static {
        HxE[] hxEArr = new HxE[30];
        System.arraycopy(HxE.A01("zh", "Mandarin Chinese", C3cG.A0r("ur", "Urdu"), C3cG.A0r("vi", "Vietnamese")), BV5.A1U(new HxE[]{C3cG.A0r("ar", "Arabic"), C3cG.A0r("bn", "Bengali"), C3cG.A0r("de", "German"), C3cG.A0r("en", ENGLISH), C3cG.A0r("es", "Spanish"), C3cG.A0r("fa", "Persian"), C3cG.A0r("fil", "Tagalog"), C3cG.A0r("fr", "French"), C3cG.A0r("he", "Hebrew"), C3cG.A0r("hi", "Hindi"), C3cG.A0r("id", "Indonesian"), C3cG.A0r("in", "Indonesian"), C3cG.A0r("it", "Italian"), C3cG.A0r("iw", "Hebrew"), C3cG.A0r("ja", "Japanese"), C3cG.A0r("kn", "Kannada"), C3cG.A0r("ko", "Korean"), C3cG.A0r("mr", "Marathi"), C3cG.A0r("ms", "Malay"), C3cG.A0r("nl", "Dutch"), C3cG.A0r("pl", "Polish"), C3cG.A0r("pt", "Portuguese"), C3cG.A0r("ta", "Tamil"), C3cG.A0r("te", "Telugu"), C3cG.A0r("th", "Thai"), C3cG.A0r("tl", "Tagalog"), C3cG.A0r("tr", "Turkish")}, hxEArr) ? 1 : 0, hxEArr, 27, 3);
        MODEL_LANGUAGE_NAMES = AGH.A0D(hxEArr);
    }

    private final Transliterator getSimplifiedToTraditional() {
        return (Transliterator) simplifiedToTraditional$delegate.getValue();
    }

    private final List<Locale> keyboardLocales(Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
        if (inputMethodManager == null) {
            return C0881AGi.A00;
        }
        try {
            List<InputMethodInfo> enabledInputMethodList = inputMethodManager.getEnabledInputMethodList();
            ArrayList<InputMethodSubtype> arrayListA0s = C60Q.A0s(enabledInputMethodList);
            Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
            while (it.hasNext()) {
                List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true);
                C7384Etj.A0U(enabledInputMethodSubtypeList);
                AbstractC0882AGj.A0r(enabledInputMethodSubtypeList, arrayListA0s);
            }
            ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0s);
            for (InputMethodSubtype inputMethodSubtype : arrayListA0s) {
                DictationLanguages dictationLanguages = INSTANCE;
                C7384Etj.A0X(inputMethodSubtype);
                arrayListA0i.add(Locale.forLanguageTag(dictationLanguages.languageTagOrLocale(inputMethodSubtype)));
            }
            return arrayListA0i;
        } catch (RuntimeException e) {
            CFK.A0A(TAG, "Couldn't read keyboard languages", e);
            return C0881AGi.A00;
        }
    }

    private final List<Locale> userLocales(Context context) {
        return AbstractC0878AGe.A0P(keyboardLocales(context), AuraAcceptLanguage.INSTANCE.locales());
    }

    private final String languageTagOrLocale(InputMethodSubtype inputMethodSubtype) {
        String languageTag = inputMethodSubtype.getLanguageTag();
        if (languageTag.length() != 0) {
            return languageTag;
        }
        String locale = inputMethodSubtype.getLocale();
        C7384Etj.A0U(locale);
        return locale.replace('_', '-');
    }

    private final String modelLanguageName(Locale locale) {
        if ("zh".equals(locale.getLanguage()) && CANTONESE_REGIONS.contains(locale.getCountry())) {
            return null;
        }
        return C60O.A0p(locale.getLanguage(), MODEL_LANGUAGE_NAMES);
    }
}
