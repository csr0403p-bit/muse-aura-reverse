package com.facebook.aura.avatarassets;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.model.AvatarMedia;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.avatarassets.AvatarAssetsSource$resolve$result$1", f = "AvatarAssetsSource.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AvatarAssetsSource$resolve$result$1 extends AbstractC07127nr implements G0U<HtJ<? super AvatarMedia>, Object> {
    public final /* synthetic */ String $gateway;
    public int label;
    public final /* synthetic */ AvatarAssetsSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarAssetsSource$resolve$result$1(AvatarAssetsSource avatarAssetsSource, String str, HtJ<? super AvatarAssetsSource$resolve$result$1> htJ) {
        super(1, htJ);
        this.this$0 = avatarAssetsSource;
        this.$gateway = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new AvatarAssetsSource$resolve$result$1(this.this$0, this.$gateway, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AvatarAssetsSource avatarAssetsSource = this.this$0;
            String str = this.$gateway;
            this.label = 1;
            obj = avatarAssetsSource.fetch(str, this);
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

    @Override // X.G0U
    public final Object invoke(HtJ<? super AvatarMedia> htJ) {
        return ((AvatarAssetsSource$resolve$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
