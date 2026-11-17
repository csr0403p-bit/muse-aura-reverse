package X;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.ViewGroup;
import com.facebook.aura.app.noopbindings.foa.NoOpVideoPlayerCreator;
import com.facebook.aura.bloks.extensions.visibility.AuraBloksVisibilityExtensionBinderUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.FHo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7852FHo implements FBE {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object A00(FBB fbb, FDW fdw) {
        C6979Edd.A00();
        boolean zA1b = AnonymousClass004.A1b(fbb, fdw);
        int i = fdw.A05;
        if (AnonymousClass801.A0i(i)) {
            if (i != 13326) {
                if (i == 13336) {
                    return new C7925FKx();
                }
                if (i != 16586) {
                    if (i != 16927) {
                        throw AnonymousClass005.A0c(i);
                    }
                    Context contextA00 = FBB.A00(fbb);
                    NoOpVideoPlayerCreator noOpVideoPlayerCreator = NoOpVideoPlayerCreator.INSTANCE;
                    C7384Etj.A0U(noOpVideoPlayerCreator);
                    return new FKF(contextA00, noOpVideoPlayerCreator);
                }
            }
            return new C7377EtL(5, 10);
        }
        if (AnonymousClass801.A0f(i)) {
            switch (i) {
                case 13317:
                    ViewGroup.MarginLayoutParams marginLayoutParams = F8Q.A0B;
                    return new F8Q(new F8P(), new C7848FHg(), fbb, fdw, FK2.A00(fdw));
                case 13320:
                case 13329:
                case 13334:
                case 13335:
                case 13666:
                case 14093:
                case 15728:
                case 15778:
                case 16260:
                case 16675:
                case 17184:
                case 23990:
                case 24966:
                case 25261:
                    break;
                case 13323:
                    return new C7239Ej8();
                case 13327:
                    boolean zA0L = fdw.A0L(38, zA1b);
                    FKG fkg = new FKG();
                    fkg.A01 = zA0L;
                    return fkg;
                case 13708:
                    return new C7813FFu(fbb);
                case 13797:
                    AtomicInteger atomicInteger = AbstractC7694FAo.A00;
                    return new Pair(Integer.valueOf(atomicInteger.incrementAndGet()), Integer.valueOf(atomicInteger.incrementAndGet()));
                case 16111:
                    return new FLU(FBB.A00(fbb));
                case 16160:
                    return new C7918FKq(fdw.A06(49, 0.0f));
                case 16444:
                    return new C7809FFq(fbb, fdw);
                case 16584:
                    return new FJ8();
                default:
                    throw AnonymousClass005.A0c(i);
            }
            return new C7377EtL(5, 10);
        }
        C6979Edd.A00();
        if (AnonymousClass801.A0h(i)) {
            switch (i) {
                case 13313:
                    return new FLQ();
                case 13337:
                    String strA0o = AbstractC7608F5v.A0o(fdw);
                    if (strA0o != null && strA0o.length() > 0) {
                        return new Hi7(strA0o);
                    }
                    break;
                case 13538:
                    return AuraBloksVisibilityExtensionBinderUtils.createController(fbb, fdw);
                case 13566:
                case 13656:
                case 16515:
                case 16913:
                case 23426:
                    break;
                case 13615:
                    return new C7650F8r();
                case 13688:
                    FL2 fl2 = new FL2();
                    fl2.A00(fdw);
                    return fl2;
                case 13762:
                    return new FLS();
                case 13768:
                    return new C7651F8s();
                case 13774:
                    return new FLO();
                case 13914:
                    return new FJZ();
                case 13981:
                    return new FJY();
                case 14001:
                    return new FL9();
                case 15833:
                    return new FLA();
                case 16310:
                    return new FL6(fbb, fdw);
                case 16529:
                    return new FLR();
                default:
                    throw AnonymousClass005.A0c(i);
            }
        }
        C6979Edd.A00();
        if (!AnonymousClass801.A0g(i) || i == 13318 || i == 13322 || i == 13330 || i == 13332 || i == 13340 || i == 15775 || i == 16526) {
            return null;
        }
        if (i != 24727) {
            if (i != 25546) {
                throw AnonymousClass005.A0c(i);
            }
            G0V g0v = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (Build.VERSION.SDK_INT < 33) {
                return null;
            }
            return new C10628Hzu(g0v, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 3);
        }
        return new C7377EtL(5, 10);
    }

    @Override // X.FBE
    public final Object ARD(FBB fbb, FDW fdw) {
        return FBA.A0A(fbb) ? FE1.A00(new C8939Ftv(fbb, fdw, this, 0), 1) : A00(fbb, fdw);
    }
}
