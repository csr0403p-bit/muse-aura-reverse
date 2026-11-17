package X;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.8iG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iG implements Ht9, G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    @Override // X.G0U
    public final Object invoke(Object obj) {
        SnapshotStateList<G0W<C7az, BFM, Integer, Unit>> snapshotStateList;
        Ht9 ht9A01;
        final C8i3 c8i3;
        final B1U b1uA01;
        final Function0 c8i4;
        final C1HY c1hy;
        final C10543Hqv c10543HqvA0z;
        final C8iF c8iF;
        final int i;
        switch (this.$t) {
            case 0:
                AqW aqW = (AqW) this.A00;
                Object obj2 = this.A01;
                Object obj3 = this.A02;
                final C7b5 c7b5 = (C7b5) obj;
                List<C7dn> list = aqW.A00;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C7dn c7dn = list.get(i2);
                    if (c7dn instanceof C7dk) {
                        final C8i3 c8i32 = new C8i3(c7dn, 0);
                        final B1U b1uA0M = ((C7dk) c7dn).A00 == 0 ? null : AnonymousClass001.A0M(new C8i6(c7dn, 0), -1930700965);
                        final C8i9 c8i9 = new C8i9(0, c7dn, obj3);
                        final BS0 bs0 = BRg.A00;
                        snapshotStateList = c7b5.A00;
                        ht9A01 = AnonymousClass001.A0M(new G0W() { // from class: X.7b6
                            @Override // X.G0W
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                G0V g0v = c8i32;
                                C7b5 c7b52 = c7b5;
                                BRg bRg = bs0;
                                G0W<? super B6A, ? super BFM, ? super Integer, Unit> g0w = b1uA0M;
                                Function0<Unit> function0 = c8i9;
                                BFM bfm = (BFM) obj5;
                                int iA0F = AnonymousClass001.A0F(obj6);
                                if ((iA0F & 6) == 0) {
                                    iA0F |= AnonymousClass004.A0d(bfm, obj4);
                                }
                                if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F & 19, 18), bfm, iA0F)) {
                                    String str = (String) g0v.invoke(bfm, 0);
                                    if (C7BY.A0j(str)) {
                                        throw C3cG.A0Q("Label must not be blank");
                                    }
                                    c7b52.A01.invoke(bRg, str, true, obj4, g0w, function0, bfm, Integer.valueOf((iA0F << 9) & 7168));
                                } else {
                                    bfm.Afo();
                                }
                                return Unit.INSTANCE;
                            }
                        }, -1789283891);
                    } else {
                        if (c7dn instanceof C7dj) {
                            C7dj c7dj = (C7dj) c7dn;
                            if (obj2 != null) {
                                int i3 = c7dj.A00;
                                TextClassification textClassification = c7dj.A01;
                                if (i3 < 0) {
                                    c8i3 = new C8i3(textClassification, 1);
                                    Drawable icon = textClassification.getIcon();
                                    b1uA01 = icon != null ? B1V.A01(new C8i6(icon, 1), -1123224187, true) : null;
                                    c8i4 = new C8i9(1, obj2, textClassification);
                                } else {
                                    RemoteAction remoteAction = textClassification.getActions().get(i3);
                                    boolean zA1M = AnonymousClass002.A1M(i3);
                                    c8i3 = new C8i3(remoteAction, 2);
                                    b1uA01 = (zA1M || remoteAction.shouldShowIcon()) ? B1V.A01(new C8i6(remoteAction, 2), -1261173016, true) : null;
                                    c8i4 = new C8i4(remoteAction, 0);
                                }
                                final BS0 bs02 = BRg.A00;
                                snapshotStateList = c7b5.A00;
                                ht9A01 = B1V.A01(new G0W() { // from class: X.7b6
                                    @Override // X.G0W
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                        G0V g0v = c8i3;
                                        C7b5 c7b52 = c7b5;
                                        BRg bRg = bs02;
                                        G0W<? super B6A, ? super BFM, ? super Integer, Unit> g0w = b1uA01;
                                        Function0<Unit> function0 = c8i4;
                                        BFM bfm = (BFM) obj5;
                                        int iA0F = AnonymousClass001.A0F(obj6);
                                        if ((iA0F & 6) == 0) {
                                            iA0F |= AnonymousClass004.A0d(bfm, obj4);
                                        }
                                        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F & 19, 18), bfm, iA0F)) {
                                            String str = (String) g0v.invoke(bfm, 0);
                                            if (C7BY.A0j(str)) {
                                                throw C3cG.A0Q("Label must not be blank");
                                            }
                                            c7b52.A01.invoke(bRg, str, true, obj4, g0w, function0, bfm, Integer.valueOf((iA0F << 9) & 7168));
                                        } else {
                                            bfm.Afo();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, -1789283891, true);
                            }
                        } else if (c7dn instanceof C7dm) {
                            snapshotStateList = c7b5.A00;
                            ht9A01 = C7b3.A00;
                        }
                    }
                    snapshotStateList.add(ht9A01);
                }
                return Unit.INSTANCE;
            case 1:
                c1hy = (C1HY) this.A00;
                Object obj4 = this.A01;
                Object obj5 = this.A02;
                c10543HqvA0z = C3cG.A0z();
                c8iF = new C8iF(obj4, obj5, c10543HqvA0z, 0);
                c1hy.getLifecycle().A04(c8iF);
                i = 1;
                break;
            default:
                c1hy = (C1HY) this.A00;
                Object obj6 = this.A01;
                Object obj7 = this.A02;
                c10543HqvA0z = C3cG.A0z();
                c8iF = new C8iF(obj6, obj7, c10543HqvA0z, 1);
                c1hy.getLifecycle().A04(c8iF);
                i = 0;
                break;
        }
        return new C78g(c8iF, c1hy, c10543HqvA0z, i) { // from class: X.8hy
            public final int $t;
            public final Object A00;
            public final Object A01;
            public final Object A02;

            {
                this.$t = i;
                this.A01 = c1hy;
                this.A02 = c8iF;
                this.A00 = c10543HqvA0z;
            }

            @Override // X.C78g
            public final void dispose() {
                int i4 = this.$t;
                ((C1HY) this.A01).getLifecycle().A05((C2Kw) this.A02);
                T t = ((C10543Hqv) this.A00).element;
                if (i4 != 0) {
                    InterfaceC06817bE interfaceC06817bE = (InterfaceC06817bE) t;
                    if (interfaceC06817bE != null) {
                        interfaceC06817bE.runStopOrDisposeEffect();
                        return;
                    }
                    return;
                }
                InterfaceC06807bD interfaceC06807bD = (InterfaceC06807bD) t;
                if (interfaceC06807bD != null) {
                    interfaceC06807bD.runPauseOrOnDisposeEffect();
                }
            }
        };
    }

    public C8iG(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }
}
