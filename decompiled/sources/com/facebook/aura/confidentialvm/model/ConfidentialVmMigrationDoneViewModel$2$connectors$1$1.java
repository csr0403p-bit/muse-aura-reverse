package com.facebook.aura.confidentialvm.model;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel$2$connectors$1$1", f = "ConfidentialVmMigrationDoneViewModel.kt", l = {75}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class ConfidentialVmMigrationDoneViewModel$2$connectors$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConfidentialVmDisconnectedItem>, Object> {
    public final /* synthetic */ String $it;
    public int label;
    public final /* synthetic */ ConfidentialVmMigrationDoneViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmMigrationDoneViewModel$2$connectors$1$1(ConfidentialVmMigrationDoneViewModel confidentialVmMigrationDoneViewModel, String str, HtJ<? super ConfidentialVmMigrationDoneViewModel$2$connectors$1$1> htJ) {
        super(2, htJ);
        this.this$0 = confidentialVmMigrationDoneViewModel;
        this.$it = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConfidentialVmMigrationDoneViewModel$2$connectors$1$1(this.this$0, this.$it, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ConfidentialVmMigrationDoneViewModel confidentialVmMigrationDoneViewModel = this.this$0;
            String str = this.$it;
            this.label = 1;
            obj = confidentialVmMigrationDoneViewModel.disconnectedItem(str, false, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super ConfidentialVmDisconnectedItem> htJ) {
        return ((ConfidentialVmMigrationDoneViewModel$2$connectors$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
