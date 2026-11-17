package X;

import com.facebook.aura.wearablebroadcast.MetaAiAppBroadcastSender;

/* loaded from: classes6.dex */
public final class Gt8 extends Gt3 {
    public Integer A00;
    public C10532Hqa A01;
    public GtC A02;

    public Gt8(String str, String str2, GtC gtC) {
        super(str2, null, new C10322Guc("#root", AnonymousClass001.A0u("#root").trim(), str));
        this.A01 = new C10532Hqa();
        this.A00 = C79.A00;
        this.A02 = gtC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // X.Gt3, X.Gt4
    /* renamed from: A02, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final Gt8 clone() {
        Gt8 gt8 = (Gt8) super.clone();
        Gt7 gt7 = ((Gt3) this).A00;
        if (gt7 != null) {
            ((Gt3) gt8).A00 = gt7.clone();
        }
        gt8.A01 = this.A01.clone();
        return gt8;
    }

    public final Gt3 A0h() {
        Gt3 gt3A0a = A0a();
        while (true) {
            if (gt3A0a == null) {
                gt3A0a = A0b("html");
                break;
            }
            if (AbstractC7608F5v.A1X("html", gt3A0a)) {
                break;
            }
            gt3A0a = gt3A0a.A0E();
        }
        Gt3 gt3A0a2 = gt3A0a.A0a();
        while (gt3A0a2 != null) {
            if (AbstractC7608F5v.A1X(MetaAiAppBroadcastSender.EXTRA_BODY, gt3A0a2) || AbstractC7608F5v.A1X("frameset", gt3A0a2)) {
                return gt3A0a2;
            }
            gt3A0a2 = gt3A0a2.A0E();
        }
        return gt3A0a.A0b(MetaAiAppBroadcastSender.EXTRA_BODY);
    }

    public final Gt3 A0i() {
        GtC gtC;
        Gt3 gt3A0a = A0a();
        while (true) {
            if (gt3A0a == null) {
                gt3A0a = A0b("html");
                break;
            }
            if (AbstractC7608F5v.A1X("html", gt3A0a)) {
                break;
            }
            gt3A0a = gt3A0a.A0E();
        }
        for (Gt3 gt3A0a2 = gt3A0a.A0a(); gt3A0a2 != null; gt3A0a2 = gt3A0a2.A0E()) {
            if (AbstractC7608F5v.A1X("head", gt3A0a2)) {
                return gt3A0a2;
            }
        }
        String str = gt3A0a.A02.A02;
        Gt3 gt3 = gt3A0a;
        while (true) {
            if (!(gt3 instanceof Gt8)) {
                gt3 = ((Gt4) gt3).A01;
                if (gt3 == null) {
                    break;
                }
            } else {
                Gt8 gt8 = (Gt8) gt3;
                if (gt8 != null) {
                    gtC = gt8.A02;
                }
            }
        }
        gtC = new GtC(new C10316GuW(0));
        Gt3 gt32 = new Gt3(gt3A0a.A06(), null, GtC.A00(gtC).A04("head", null, str, gtC.A02.A01));
        gt3A0a.A0Q(new Gt4[]{gt32}, 0);
        return gt32;
    }
}
