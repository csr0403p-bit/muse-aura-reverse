package com.facebook.aura.vds.compose.bottomsheet.wrapper;

import X.AXN;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BBI;
import X.BFM;
import X.C0Hi;
import X.C1741Ape;
import X.C1743Apg;
import X.C1C3;
import X.C78N;
import X.G0U;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraModalBottomSheetWrapperKt {
    public static final long IME_DISMISS_TIMEOUT_MS = 600;

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca  */
    /* renamed from: AuraModalBottomSheetWrapper-NpZTi58, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2406AuraModalBottomSheetWrapperNpZTi58(X.BRg r32, kotlin.jvm.functions.Function0<kotlin.Unit> r33, X.BA3 r34, com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState r35, long r36, boolean r38, boolean r39, X.G0W<? super X.C07C, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r40, X.BFM r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.bottomsheet.wrapper.AuraModalBottomSheetWrapperKt.m2406AuraModalBottomSheetWrapperNpZTi58(X.BRg, kotlin.jvm.functions.Function0, X.BA3, com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState, long, boolean, boolean, X.G0W, X.BFM, int, int):void");
    }

    public static final boolean rememberImeSettled(BFM bfm, int i) {
        bfm.AgE(758956792);
        AXN axn = (AXN) bfm.A6v(Am0.A04);
        C0Hi c0Hi = (C0Hi) bfm.A6v(Am0.A05);
        C1C3 c1c3 = (C1C3) bfm.A6v(Am0.A0E);
        C1741Ape c1741Ape = C1743Apg.A01(bfm).A02;
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            Snapshot snapshotA03 = Snapshot.A03();
            G0U<Object, Unit> g0uA0D = snapshotA03 != null ? snapshotA03.A0D() : null;
            Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
            try {
                int iACy = c1741Ape.ACy(axn);
                Snapshot.A07(snapshotA03, snapshotA04, g0uA0D);
                objAaT = AnonymousClass005.A0S(bfm, AnonymousClass002.A1M(iACy));
            } catch (Throwable th) {
                Snapshot.A07(snapshotA03, snapshotA04, g0uA0D);
                throw th;
            }
        }
        MutableState mutableState = (MutableState) objAaT;
        if (MutableState.A0A(mutableState)) {
            BBI.A0R(AnonymousClass002.A0M(bfm, 1374586154), false);
            return true;
        }
        bfm.AgE(1374320918);
        Unit unit = Unit.INSTANCE;
        boolean zA1W = AnonymousClass005.A1W(bfm, c0Hi, c1741Ape, axn, bfm.A65(c1c3));
        Object objAaT2 = bfm.AaT();
        if (zA1W || objAaT2 == obj) {
            objAaT2 = new AuraModalBottomSheetWrapperKt$rememberImeSettled$1$1(c1c3, c0Hi, c1741Ape, axn, mutableState, null);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A18(bfm, objAaT2, unit);
        AnonymousClass006.A1N(bfm);
        return false;
    }
}
