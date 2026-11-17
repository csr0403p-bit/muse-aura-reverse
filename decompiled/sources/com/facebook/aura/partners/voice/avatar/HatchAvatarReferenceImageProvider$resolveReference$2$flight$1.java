package com.facebook.aura.partners.voice.avatar;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$resolveReference$2$flight$1", f = "HatchAvatarReferenceImageProvider.kt", l = {266}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAvatarReferenceImageProvider$resolveReference$2$flight$1 extends AbstractC07127nr implements G0U<HtJ<? super HatchAvatarReference>, Object> {
    public final /* synthetic */ String $accessToken;
    public final /* synthetic */ String $avatarStillPath;
    public final /* synthetic */ String $sourceSha1;
    public int label;
    public final /* synthetic */ HatchAvatarReferenceImageProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarReferenceImageProvider$resolveReference$2$flight$1(HatchAvatarReferenceImageProvider hatchAvatarReferenceImageProvider, String str, String str2, String str3, HtJ<? super HatchAvatarReferenceImageProvider$resolveReference$2$flight$1> htJ) {
        super(1, htJ);
        this.this$0 = hatchAvatarReferenceImageProvider;
        this.$accessToken = str;
        this.$avatarStillPath = str2;
        this.$sourceSha1 = str3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchAvatarReferenceImageProvider$resolveReference$2$flight$1(this.this$0, this.$accessToken, this.$avatarStillPath, this.$sourceSha1, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchAvatarReferenceImageProvider hatchAvatarReferenceImageProvider = this.this$0;
            String str = this.$accessToken;
            String str2 = this.$avatarStillPath;
            String str3 = this.$sourceSha1;
            this.label = 1;
            obj = hatchAvatarReferenceImageProvider.resolveRaw(str, str2, str3, this);
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
    public final Object invoke(HtJ<? super HatchAvatarReference> htJ) {
        return ((HatchAvatarReferenceImageProvider$resolveReference$2$flight$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
