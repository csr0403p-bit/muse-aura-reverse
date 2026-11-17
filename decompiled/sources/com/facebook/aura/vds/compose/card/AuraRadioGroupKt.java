package com.facebook.aura.vds.compose.card;

import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.F60;
import X.G0V;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraRadioGroupKt {

    /* renamed from: com.facebook.aura.vds.compose.card.AuraRadioGroupKt$AuraRadioGroup$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ SnapshotStateList<AuraRadioTapOption> $options;
        public final /* synthetic */ String $radioGroupTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, String str, SnapshotStateList<AuraRadioTapOption> snapshotStateList, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$radioGroupTitle = str;
            this.$options = snapshotStateList;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraRadioGroupKt.AuraRadioGroup(this.$modifier, this.$radioGroupTitle, this.$options, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void flipChecks(SnapshotStateList<AuraRadioTapOption> snapshotStateList, int i) {
        C7384Etj.A0Y(snapshotStateList, 0);
        Iterator it = snapshotStateList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            AuraRadioTapOption auraRadioTapOption = (AuraRadioTapOption) next;
            snapshotStateList.set(i2, i2 != i ? AuraRadioTapOption.m2505copyMevLcKo$default(auraRadioTapOption, null, null, null, false, null, null, false, false, 0.0f, null, false, null, false, null, null, null, 65471, null) : AuraRadioTapOption.m2505copyMevLcKo$default(auraRadioTapOption, null, null, null, false, null, null, true, false, 0.0f, null, false, null, false, null, null, null, 65471, null));
            i2 = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, java.lang.Object, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraRadioGroup(X.BRg r28, java.lang.String r29, androidx.compose.runtime.snapshots.SnapshotStateList<com.facebook.aura.vds.compose.card.AuraRadioTapOption> r30, X.BFM r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.card.AuraRadioGroupKt.AuraRadioGroup(X.BRg, java.lang.String, androidx.compose.runtime.snapshots.SnapshotStateList, X.BFM, int, int):void");
    }
}
