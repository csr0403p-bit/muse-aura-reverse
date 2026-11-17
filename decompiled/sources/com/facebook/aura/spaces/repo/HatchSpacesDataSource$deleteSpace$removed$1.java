package com.facebook.aura.spaces.repo;

import X.AbstractC07127nr;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.repo.HatchSpacesDataSource$deleteSpace$removed$1", f = "HatchSpacesDataSource.kt", l = {332}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchSpacesDataSource$deleteSpace$removed$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ boolean $isOwnedSpace;
    public final /* synthetic */ String $urlId;
    public int label;
    public final /* synthetic */ HatchSpacesDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpacesDataSource$deleteSpace$removed$1(HatchSpacesDataSource hatchSpacesDataSource, String str, boolean z, HtJ<? super HatchSpacesDataSource$deleteSpace$removed$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchSpacesDataSource;
        this.$urlId = str;
        this.$isOwnedSpace = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSpacesDataSource$deleteSpace$removed$1(this.this$0, this.$urlId, this.$isOwnedSpace, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchSpacesDataSource hatchSpacesDataSource = this.this$0;
            String str = this.$urlId;
            String strA00 = this.$isOwnedSpace ? "space" : AnonymousClass000.A00(16);
            this.label = 1;
            obj = hatchSpacesDataSource.deleteSpaceViaJarvis(str, strA00, this);
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
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return ((HatchSpacesDataSource$deleteSpace$removed$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
