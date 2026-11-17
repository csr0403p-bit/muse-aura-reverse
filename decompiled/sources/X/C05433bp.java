package X;

import android.content.Context;
import kotlin.Unit;

/* renamed from: X.3bp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05433bp extends AbstractC7559F3s implements G0U {
    public final int $t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05433bp(int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, X.BL4] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, X.EXE] */
    @Override // X.G0U
    public final /* bridge */ /* synthetic */ T invoke(T t) {
        switch (this.$t) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return t;
            case 6:
            case 8:
            case 9:
            case 11:
                AnonymousClass005.A0w(t);
                return 0;
            case 7:
            case 10:
                return new BL4(0 << 32);
            case 12:
                AbstractC1564Ale.A06((InterfaceC0857A6e) t, 0);
                break;
            case 13:
            case 15:
            case 17:
            case 21:
            case 24:
                return Unit.INSTANCE;
            case 14:
            case 16:
            case 22:
                ((InterfaceC0857A6e) t).Aca(AbstractC1671Anw.A0I, true);
                break;
            case 18:
                AbstractC1564Ale.A05((InterfaceC0857A6e) t);
                break;
            case 19:
                return AnonymousClass001.A0i();
            case 20:
            case 23:
                C0920AHw<Unit> c0920AHw = AbstractC1671Anw.A0J;
                ?? r1 = Unit.INSTANCE;
                ((InterfaceC0857A6e) t).Aca(c0920AHw, r1);
                return r1;
            case 25:
                Context context = (Context) t;
                C7384Etj.A0Y(context, 0);
                return new EXE(new C2qU(context));
            default:
                return null;
        }
        return Unit.INSTANCE;
    }
}
