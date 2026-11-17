package com.facebook.aura.globaleffects.api;

import X.AGO;
import X.AKH;
import X.AKJ;
import X.AKO;
import X.AKT;
import X.AXN;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C0981AMm;
import X.C0Yr;
import X.C1743Apg;
import X.C1Ny;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C78g;
import X.EnumC1820Arj;
import X.G0U;
import X.G0V;
import X.HxE;
import android.os.IBinder;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AppFloatingLayerKt {
    public static final AKH<AppFloatingInsets> LocalAppFloatingInsets = new AGO(new Function0() { // from class: com.facebook.aura.globaleffects.api.AppFloatingLayerKt$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppFloatingLayerKt.LocalAppFloatingInsets$lambda$0();
        }
    });
    public static final AKH<View> LocalAppFloatingApplicationView = new AGO(new Function0() { // from class: com.facebook.aura.globaleffects.api.AppFloatingLayerKt$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return null;
        }
    });
    public static final AKH<FloatingWindowRegistry> LocalFloatingWindowRegistry = new AGO(new Function0() { // from class: com.facebook.aura.globaleffects.api.AppFloatingLayerKt$$ExternalSyntheticLambda10
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return null;
        }
    });

    public static final AppFloatingInsets LocalAppFloatingInsets$lambda$0() {
        return new AppFloatingInsets(0, 0, 0, 0);
    }

    public static final List<HxE<Integer, AppFloatingLayer>> floatingLayers() {
        return C60O.A11(0);
    }

    /* renamed from: $r8$lambda$Cub5iq535p5u_l-S1JKY-iAU5Kc, reason: not valid java name */
    public static /* synthetic */ C78g m970$r8$lambda$Cub5iq535p5u_lS1JKYiAU5Kc(C0981AMm c0981AMm, long j, C0Yr c0Yr) {
        return new AppFloatingLayerKt$AppFloatingLayers$lambda$4$0$$inlined$onDispose$1(c0981AMm, j);
    }

    public static final void AppFloatingLayers(BRg bRg, boolean z, BFM bfm, final int i, final int i2) {
        Long next;
        FloatingWindow next2;
        FloatingWindow next3;
        View view;
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> g0v;
        final BRg bRg2 = bRg;
        final boolean z2 = z;
        bfm.AgG(1653045203);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            BBI bbi = (BBI) bfm;
            FloatingWindowRegistry floatingWindowRegistry = (FloatingWindowRegistry) AKO.A07(LocalFloatingWindowRegistry, bbi);
            if (floatingWindowRegistry == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    g0v = new G0V() { // from class: com.facebook.aura.globaleffects.api.AppFloatingLayerKt$$ExternalSyntheticLambda0
                        @Override // X.G0V
                        public final Object invoke(Object obj, Object obj2) {
                            BRg bRg3 = bRg2;
                            boolean z3 = z2;
                            int i5 = i;
                            AppFloatingLayerKt.AppFloatingLayers(bRg3, z3, (BFM) obj, AnonymousClass011.A00(i5), i2);
                            return Unit.INSTANCE;
                        }
                    };
                }
            } else {
                final List<HxE<Integer, AppFloatingLayer>> list = floatingWindowRegistry.layers;
                if (list.isEmpty()) {
                    bBbAAc = bfm.AAc();
                    if (bBbAAc == null) {
                        return;
                    } else {
                        g0v = new G0V() { // from class: com.facebook.aura.globaleffects.api.AppFloatingLayerKt$$ExternalSyntheticLambda1
                            @Override // X.G0V
                            public final Object invoke(Object obj, Object obj2) {
                                BRg bRg3 = bRg2;
                                boolean z3 = z2;
                                int i5 = i;
                                AppFloatingLayerKt.AppFloatingLayers(bRg3, z3, (BFM) obj, AnonymousClass011.A00(i5), i2);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                } else {
                    final C0981AMm<Long, FloatingWindow> c0981AMm = floatingWindowRegistry.windows;
                    boolean zA65 = bfm.A65(floatingWindowRegistry);
                    Object objAaT = bfm.AaT();
                    if (zA65 || objAaT == C78N.A00) {
                        objAaT = Long.valueOf(floatingWindowRegistry.nextId.incrementAndGet());
                        bfm.Ai0(objAaT);
                    }
                    final long jA05 = C3cG.A05(objAaT);
                    AXN axnA04 = AKO.A04(Am0.A04, bbi);
                    final View view2 = (View) AKO.A07(AndroidCompositionLocals_androidKt.A05, bbi);
                    EnumC1820Arj enumC1820Arj = (EnumC1820Arj) AKO.A07(Am0.A0A, bbi);
                    C1Ny c1Ny = C1743Apg.A01(bfm).A0E;
                    final AppFloatingInsets appFloatingInsets = new AppFloatingInsets(c1Ny.AH1(axnA04, enumC1820Arj), c1Ny.ALn(axnA04), c1Ny.AJo(axnA04, enumC1820Arj), Math.max(c1Ny.ACy(axnA04), C1743Apg.A01(bfm).A02.ACy(axnA04)));
                    boolean zA1X = AnonymousClass005.A1X(bfm, appFloatingInsets, view2, bfm.A65(c0981AMm) | bfm.A64(jA05), AnonymousClass004.A1I(iA0d));
                    Object objAaT2 = bfm.AaT();
                    if (zA1X || objAaT2 == C78N.A00) {
                        final boolean z3 = z2;
                        objAaT2 = new Function0() { // from class: com.facebook.aura.globaleffects.api.AppFloatingLayerKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AppFloatingLayerKt.AppFloatingLayers$lambda$3$0(c0981AMm, jA05, z3, appFloatingInsets, view2);
                            }
                        };
                        BBI.A0O(bbi, objAaT2);
                    }
                    AnonymousClass001.A15(bfm, objAaT2);
                    Long lValueOf = Long.valueOf(jA05);
                    boolean zA652 = bfm.A65(c0981AMm) | bfm.A64(jA05);
                    Object objAaT3 = bfm.AaT();
                    if (zA652 || objAaT3 == C78N.A00) {
                        objAaT3 = new G0U() { // from class: com.facebook.aura.globaleffects.api.AppFloatingLayerKt$$ExternalSyntheticLambda3
                            @Override // X.G0U
                            public final Object invoke(Object obj) {
                                return new AppFloatingLayerKt$AppFloatingLayers$lambda$4$0$$inlined$onDispose$1(c0981AMm, jA05);
                            }
                        };
                        BBI.A0O(bbi, objAaT3);
                    }
                    C78e.A03(bfm, floatingWindowRegistry, lValueOf, (G0U) objAaT3);
                    Set<Long> setKeySet = c0981AMm.keySet();
                    final Comparator comparator = new Comparator() { // from class: com.facebook.aura.globaleffects.api.AppFloatingLayerKt$AppFloatingLayers$$inlined$compareBy$1
                        /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
                        @Override // java.util.Comparator
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final int compare(T r7, T r8) {
                            /*
                                r6 = this;
                                long r2 = X.C3cG.A05(r7)
                                X.AMm r1 = r1
                                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                                java.lang.Object r0 = r1.get(r0)
                                com.facebook.aura.globaleffects.api.FloatingWindow r0 = (com.facebook.aura.globaleffects.api.FloatingWindow) r0
                                r5 = 1
                                if (r0 == 0) goto L18
                                boolean r1 = r0.isRoot
                                r0 = 1
                                if (r1 == 0) goto L19
                            L18:
                                r0 = 0
                            L19:
                                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
                                long r2 = X.C3cG.A05(r8)
                                X.AMm r1 = r1
                                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                                java.lang.Object r0 = r1.get(r0)
                                com.facebook.aura.globaleffects.api.FloatingWindow r0 = (com.facebook.aura.globaleffects.api.FloatingWindow) r0
                                if (r0 == 0) goto L3c
                                boolean r0 = r0.isRoot
                                if (r0 != 0) goto L3c
                            L33:
                                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
                                int r0 = r4.compareTo(r0)
                                return r0
                            L3c:
                                r5 = 0
                                goto L33
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.globaleffects.api.AppFloatingLayerKt$AppFloatingLayers$$inlined$compareBy$1.compare(java.lang.Object, java.lang.Object):int");
                        }
                    };
                    Comparator comparator2 = new Comparator() { // from class: com.facebook.aura.globaleffects.api.AppFloatingLayerKt$AppFloatingLayers$$inlined$thenBy$1
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            int iCompare = comparator.compare(t, t2);
                            return iCompare == 0 ? Long.valueOf(C3cG.A05(t)).compareTo(Long.valueOf(C3cG.A05(t2))) : iCompare;
                        }
                    };
                    C7384Etj.A0Y(setKeySet, 0);
                    Iterator<Long> it = setKeySet.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        while (it.hasNext()) {
                            Long next4 = it.next();
                            if (comparator2.compare(next, next4) < 0) {
                                next = next4;
                            }
                        }
                    } else {
                        next = null;
                    }
                    Long l = next;
                    Collection<FloatingWindow> collectionValues = c0981AMm.values();
                    Iterator<FloatingWindow> it2 = collectionValues.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        } else {
                            next2 = it2.next();
                            if (next2.isRoot) {
                                break;
                            }
                        }
                    }
                    FloatingWindow floatingWindow = next2;
                    AppFloatingInsets appFloatingInsets2 = floatingWindow != null ? floatingWindow.insets : null;
                    FloatingWindow floatingWindow2 = c0981AMm.get(l);
                    IBinder applicationWindowToken = (floatingWindow2 == null || (view = floatingWindow2.view) == null) ? null : view.getApplicationWindowToken();
                    Iterator<FloatingWindow> it3 = collectionValues.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                        FloatingWindow floatingWindow3 = next3;
                        if (applicationWindowToken != null && C7384Etj.areEqual(floatingWindow3.view.getWindowToken(), applicationWindowToken)) {
                            break;
                        }
                    }
                    FloatingWindow floatingWindow4 = next3;
                    View view3 = floatingWindow4 != null ? floatingWindow4.view : null;
                    if (l == null || l.longValue() != jA05 || appFloatingInsets2 == null) {
                        bfm.AgE(-223819889);
                    } else {
                        bfm.AgE(-224055334);
                        AKT.A02(bfm, B1V.A00(bfm, new G0V() { // from class: com.facebook.aura.globaleffects.api.AppFloatingLayerKt$$ExternalSyntheticLambda4
                            @Override // X.G0V
                            public final Object invoke(Object obj, Object obj2) {
                                return AppFloatingLayerKt.AppFloatingLayers$lambda$9(list, bRg2, (BFM) obj, AnonymousClass001.A0F(obj2));
                            }
                        }, -163063551), new AKJ[]{LocalAppFloatingInsets.A04(appFloatingInsets2), LocalAppFloatingApplicationView.A04(view3)}, 48);
                    }
                    BBI.A0R(bbi, false);
                }
            }
            bBbAAc.A06 = g0v;
            return;
        }
        bfm.Afo();
        BBb bBbAAc2 = bfm.AAc();
        if (bBbAAc2 != null) {
            bBbAAc2.A06 = new G0V() { // from class: com.facebook.aura.globaleffects.api.AppFloatingLayerKt$$ExternalSyntheticLambda5
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    BRg bRg3 = bRg2;
                    boolean z4 = z2;
                    int i5 = i;
                    AppFloatingLayerKt.AppFloatingLayers(bRg3, z4, (BFM) obj, AnonymousClass011.A00(i5), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final C78g AppFloatingLayers$lambda$4$0(C0981AMm c0981AMm, long j, C0Yr c0Yr) {
        return new AppFloatingLayerKt$AppFloatingLayers$lambda$4$0$$inlined$onDispose$1(c0981AMm, j);
    }

    public static final Unit AppFloatingLayers$lambda$9(List list, BRg bRg, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HxE hxE = (HxE) it.next();
                int iA0F = AnonymousClass001.A0F(hxE.first);
                AppFloatingLayer appFloatingLayer = (AppFloatingLayer) hxE.second;
                bfm.Ag8(330425836, Integer.valueOf(iA0F));
                appFloatingLayer.Content(bRg, bfm, 0);
                AnonymousClass001.A1D(bfm);
            }
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final View LocalAppFloatingApplicationView$lambda$0() {
        return null;
    }

    public static final FloatingWindowRegistry LocalFloatingWindowRegistry$lambda$0() {
        return null;
    }

    public static final AKH<View> getLocalAppFloatingApplicationView() {
        return LocalAppFloatingApplicationView;
    }

    public static final AKH<AppFloatingInsets> getLocalAppFloatingInsets() {
        return LocalAppFloatingInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void AppFloatingEffects(BFM bfm, final int i) {
        bfm.AgG(1151352210);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = C60O.A11(0);
                bfm.Ai0(objAaT);
            }
            for (HxE hxE : (List) objAaT) {
                int iIntValue = ((Number) hxE.first).intValue();
                AppFloatingLayer appFloatingLayer = (AppFloatingLayer) hxE.second;
                bfm.Ag8(2129106470, Integer.valueOf(iIntValue));
                appFloatingLayer.Effects(bfm, 0);
                BBI.A0R((BBI) bfm, false);
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.globaleffects.api.AppFloatingLayerKt$$ExternalSyntheticLambda7
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    int i2 = i;
                    AnonymousClass001.A0F(obj2);
                    AppFloatingLayerKt.AppFloatingEffects((BFM) obj, AnonymousClass011.A00(i2));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit AppFloatingEffects$lambda$2(int i, BFM bfm, int i2) {
        AppFloatingEffects(bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit AppFloatingLayers$lambda$0(BRg bRg, boolean z, int i, int i2, BFM bfm, int i3) {
        AppFloatingLayers(bRg, z, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit AppFloatingLayers$lambda$1(BRg bRg, boolean z, int i, int i2, BFM bfm, int i3) {
        AppFloatingLayers(bRg, z, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit AppFloatingLayers$lambda$10(BRg bRg, boolean z, int i, int i2, BFM bfm, int i3) {
        AppFloatingLayers(bRg, z, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit AppFloatingLayers$lambda$3$0(C0981AMm c0981AMm, long j, boolean z, AppFloatingInsets appFloatingInsets, View view) {
        c0981AMm.put(Long.valueOf(j), new FloatingWindow(z, appFloatingInsets, view));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ProvideAppFloatingLayers(final Object obj, final G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, final int i) {
        AnonymousClass003.A0u(obj, g0v);
        bfm.AgG(-1085256500);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, obj) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            boolean zA65 = bfm.A65(obj);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new FloatingWindowRegistry();
                BBI.A0T(bfm, objAaT);
            }
            AKT.A01(bfm, LocalFloatingWindowRegistry.A04(objAaT), g0v, iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.globaleffects.api.AppFloatingLayerKt$$ExternalSyntheticLambda6
                @Override // X.G0V
                public final Object invoke(Object obj2, Object obj3) {
                    Object obj4 = obj;
                    G0V g0v2 = g0v;
                    int i2 = i;
                    AnonymousClass001.A0F(obj3);
                    AppFloatingLayerKt.ProvideAppFloatingLayers(obj4, g0v2, (BFM) obj2, AnonymousClass011.A00(i2));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit ProvideAppFloatingLayers$lambda$1(Object obj, G0V g0v, int i, BFM bfm, int i2) {
        ProvideAppFloatingLayers(obj, g0v, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }
}
