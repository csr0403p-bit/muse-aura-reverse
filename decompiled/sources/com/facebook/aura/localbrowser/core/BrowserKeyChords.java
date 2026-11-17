package com.facebook.aura.localbrowser.core;

import X.AGH;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BQG;
import X.BV7;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.HxE;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;
import com.facebook.aura.localbrowser.LocalBrowserNodeHandler;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.nodes.cards.HatchGeofenceCardKt;
import com.hatch.browser.protocol.Key;
import com.hatch.browser.protocol.KeyChord;
import com.hatch.browser.protocol.KeyModifier;
import com.hatch.browser.protocol.NamedKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class BrowserKeyChords {
    public static final int $stable = 0;
    public static final BrowserKeyChords INSTANCE = new BrowserKeyChords();
    public static final int MAX_CHORDS = 16;
    public static final Map<String, KeyModifier> modifiers;
    public static final Map<String, NamedKey> namedKeys;

    public final List<KeyChord> parse(String str) {
        C7384Etj.A0Y(str, 0);
        List listA14 = BV7.A14(AnonymousClass002.A0l(str), "\\s+");
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA14.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it);
        }
        if (!arrayListA0h.isEmpty() && arrayListA0h.size() <= 16) {
            ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
            Iterator it2 = arrayListA0h.iterator();
            while (it2.hasNext()) {
                KeyChord keyChordChord = INSTANCE.chord(AnonymousClass005.A0j(it2));
                if (keyChordChord != null) {
                    arrayListA0i.add(keyChordChord);
                }
            }
            return arrayListA0i;
        }
        return null;
    }

    static {
        NamedKey namedKey = NamedKey.ENTER;
        HxE hxEA0r = C3cG.A0r(HatchGeofenceCardKt.TRIGGER_ENTER, namedKey);
        HxE hxEA0r2 = C3cG.A0r("return", namedKey);
        HxE hxEA0r3 = C3cG.A0r("tab", NamedKey.TAB);
        NamedKey namedKey2 = NamedKey.ESCAPE;
        HxE hxEA0r4 = C3cG.A0r("escape", namedKey2);
        HxE hxEA0r5 = C3cG.A0r("esc", namedKey2);
        HxE hxEA0r6 = C3cG.A0r("backspace", NamedKey.BACKSPACE);
        HxE hxEA0r7 = C3cG.A0r("delete", NamedKey.DELETE);
        NamedKey namedKey3 = NamedKey.ARROW_UP;
        HxE hxEA0r8 = C3cG.A0r("arrowup", namedKey3);
        NamedKey namedKey4 = NamedKey.ARROW_DOWN;
        HxE hxEA0r9 = C3cG.A0r("arrowdown", namedKey4);
        NamedKey namedKey5 = NamedKey.ARROW_LEFT;
        HxE hxEA0r10 = C3cG.A0r("arrowleft", namedKey5);
        NamedKey namedKey6 = NamedKey.ARROW_RIGHT;
        namedKeys = AGH.A0D(hxEA0r, hxEA0r2, hxEA0r3, hxEA0r4, hxEA0r5, hxEA0r6, hxEA0r7, hxEA0r8, hxEA0r9, hxEA0r10, C3cG.A0r("arrowright", namedKey6), C3cG.A0r("up", namedKey3), C3cG.A0r("down", namedKey4), C3cG.A0r("left", namedKey5), C3cG.A0r("right", namedKey6), C3cG.A0r(AuraDeeplinkRouteMapper.HOME_ROUTE, NamedKey.HOME), C3cG.A0r("end", NamedKey.END), C3cG.A0r("pageup", NamedKey.PAGE_UP), C3cG.A0r("pagedown", NamedKey.PAGE_DOWN), C3cG.A0r("space", NamedKey.SPACE), C3cG.A0r("insert", NamedKey.INSERT));
        HxE hxEA0r11 = C3cG.A0r("shift", KeyModifier.SHIFT);
        KeyModifier keyModifier = KeyModifier.CONTROL;
        HxE hxEA0r12 = C3cG.A0r("ctrl", keyModifier);
        HxE hxEA0r13 = C3cG.A0r(LocalBrowserNodeHandler.CONTROL, keyModifier);
        KeyModifier keyModifier2 = KeyModifier.ALT;
        HxE hxEA0r14 = C3cG.A0r("alt", keyModifier2);
        HxE hxEA0r15 = C3cG.A0r(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_OPTION, keyModifier2);
        KeyModifier keyModifier3 = KeyModifier.META;
        modifiers = AGH.A0D(hxEA0r11, hxEA0r12, hxEA0r13, hxEA0r14, hxEA0r15, C3cG.A0r("meta", keyModifier3), C3cG.A0r("cmd", keyModifier3), C3cG.A0r(NodeCommandFallbackWorker.KEY_COMMAND, keyModifier3));
    }

    private final KeyChord chord(String str) {
        List listA0g;
        Key key;
        List listA0X;
        if ("+".equals(str)) {
            key = new Key.Character(str);
            listA0X = C0881AGi.A00;
        } else {
            C7384Etj.A0Y(str, 0);
            if (str.endsWith("++")) {
                int length = str.length() - 2;
                if (length < 0) {
                    length = 0;
                }
                listA0g = AbstractC0878AGe.A0Q("+", C7BY.A0g(BQG.A17(str, length), new char[]{'+'}));
            } else {
                listA0g = C7BY.A0g(str, new char[]{'+'});
            }
            key = key((String) AbstractC0878AGe.A0H(listA0g));
            if (key == null) {
                return null;
            }
            List listA0d = AbstractC0878AGe.A0d(listA0g, 1);
            ArrayList arrayListA0i = AnonymousClass003.A0i(listA0d);
            Iterator it = listA0d.iterator();
            while (it.hasNext()) {
                KeyModifier keyModifier = modifiers.get(AnonymousClass001.A0u(AnonymousClass005.A0j(it)));
                if (keyModifier == null) {
                    return null;
                }
                arrayListA0i.add(keyModifier);
            }
            listA0X = AbstractC0878AGe.A0X(AbstractC0878AGe.A0f(arrayListA0i));
        }
        return new KeyChord(key, listA0X);
    }

    private final Key key(String str) {
        NamedKey namedKey = namedKeys.get(AnonymousClass001.A0u(str));
        if (namedKey != null) {
            return new Key.Named(namedKey);
        }
        int length = str.length();
        if (length <= 0 || str.codePointCount(0, length) != 1) {
            return null;
        }
        return new Key.Character(str);
    }
}
