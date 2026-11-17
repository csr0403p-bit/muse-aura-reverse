package X;

import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.Bax, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2421Bax {
    public static final C2421Bax A00;
    public static final C2421Bax A01;
    public static final C2421Bax A02;
    public static final C2421Bax A03;
    public static final C2421Bax A04;
    public static final C2421Bax A05;
    public static final C2421Bax A06;
    public static final List<C2421Bax> A07;
    public static final Set<C2421Bax> A08;

    static {
        C2423Baz c2423Baz = new C2423Baz("SD", Collections.unmodifiableList(Arrays.asList(BV6.A0P(720, 480), BV6.A0P(640, 480))), 4);
        A05 = c2423Baz;
        C2423Baz c2423Baz2 = new C2423Baz("HD", Collections.singletonList(BV6.A0P(1280, 720)), 5);
        A01 = c2423Baz2;
        C2423Baz c2423Baz3 = new C2423Baz("FHD", Collections.singletonList(BV6.A0P(1920, 1080)), 6);
        A00 = c2423Baz3;
        C2423Baz c2423Baz4 = new C2423Baz("UHD", Collections.singletonList(BV6.A0P(3840, 2160)), 8);
        A06 = c2423Baz4;
        List list = Collections.EMPTY_LIST;
        C2423Baz c2423Baz5 = new C2423Baz("LOWEST", list, 0);
        A03 = c2423Baz5;
        C2423Baz c2423Baz6 = new C2423Baz("HIGHEST", list, 1);
        A02 = c2423Baz6;
        A04 = new C2423Baz(HatchPersistedMessageJson.UNSEND_STATUS_NONE, list, -1);
        A08 = BV5.A0v(new C2421Bax[]{c2423Baz5, c2423Baz6, c2423Baz, c2423Baz2, c2423Baz3, c2423Baz4});
        A07 = Arrays.asList(c2423Baz4, c2423Baz3, c2423Baz2, c2423Baz);
    }
}
