package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.C1er;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchMapSceneRegistryKt {

    /* renamed from: com.facebook.aura.maps.HatchMapSceneRegistryKt$LeaveEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Object $key;
        public final /* synthetic */ Function0<Unit> $leave;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Object obj, Function0<Unit> function0, int i) {
            super(2);
            this.$key = obj;
            this.$leave = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchMapSceneRegistryKt.LeaveEffect(this.$key, this.$leave, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void LeaveEffect(Object obj, Function0<Unit> function0, BFM bfm, int i) {
        C7384Etj.A0Y(function0, 1);
        bfm.AgG(-1302551968);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, obj) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            boolean zA65 = bfm.A65(mutableStateA00);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchMapSceneRegistryKt$LeaveEffect$1$1(mutableStateA00);
                BBI.A0T(bfm, objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, obj);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(obj, function0, i);
        }
    }
}
