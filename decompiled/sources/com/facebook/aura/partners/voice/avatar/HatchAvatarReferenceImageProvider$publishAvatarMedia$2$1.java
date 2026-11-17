package com.facebook.aura.partners.voice.avatar;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.coroutines.SingleFlight;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$publishAvatarMedia$2$1", f = "HatchAvatarReferenceImageProvider.kt", l = {665}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAvatarReferenceImageProvider$publishAvatarMedia$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchAvatarSelection $selection;
    public final /* synthetic */ String $uri;
    public int label;
    public final /* synthetic */ HatchAvatarReferenceImageProvider this$0;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$publishAvatarMedia$2$1$1", f = "HatchAvatarReferenceImageProvider.kt", l = {666}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider$publishAvatarMedia$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchAvatarSelection $selection;
        public final /* synthetic */ String $uri;
        public int label;
        public final /* synthetic */ HatchAvatarReferenceImageProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchAvatarReferenceImageProvider hatchAvatarReferenceImageProvider, HatchAvatarSelection hatchAvatarSelection, String str, HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
            this.this$0 = hatchAvatarReferenceImageProvider;
            this.$selection = hatchAvatarSelection;
            this.$uri = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass1(this.this$0, this.$selection, this.$uri, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAvatarIdlePosterCache hatchAvatarIdlePosterCache = this.this$0.idlePosters;
                String str = this.$selection.reference.assetId;
                String str2 = this.$uri;
                this.label = 1;
                if (hatchAvatarIdlePosterCache.prepare$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(str, str2, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarReferenceImageProvider$publishAvatarMedia$2$1(HatchAvatarReferenceImageProvider hatchAvatarReferenceImageProvider, HatchAvatarSelection hatchAvatarSelection, String str, HtJ<? super HatchAvatarReferenceImageProvider$publishAvatarMedia$2$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchAvatarReferenceImageProvider;
        this.$selection = hatchAvatarSelection;
        this.$uri = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAvatarReferenceImageProvider$publishAvatarMedia$2$1(this.this$0, this.$selection, this.$uri, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            SingleFlight singleFlight = this.this$0.singleFlight;
            HatchAvatarIdleKey hatchAvatarIdleKey = new HatchAvatarIdleKey(this.$selection.reference.assetId, this.$uri);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$selection, this.$uri, null);
            this.label = 1;
            if (singleFlight.invoke(hatchAvatarIdleKey, anonymousClass1, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchAvatarReferenceImageProvider$publishAvatarMedia$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
