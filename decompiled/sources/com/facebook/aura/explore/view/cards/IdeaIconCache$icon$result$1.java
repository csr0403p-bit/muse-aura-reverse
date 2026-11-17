package com.facebook.aura.explore.view.cards;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightResult;
import com.facebook.aura.gateway.HatchThumbnailDisplaySize;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.explore.view.cards.IdeaIconCache$icon$result$1", f = "IdeaPreviewImageUrls.kt", l = {119}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class IdeaIconCache$icon$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SingleFlightResult<? extends IdeaIcon>>, Object> {
    public final /* synthetic */ String $cacheKey;
    public final /* synthetic */ HatchThumbnailDisplaySize $displaySize;
    public final /* synthetic */ String $ideaId;
    public int label;
    public final /* synthetic */ IdeaIconCache this$0;

    @DebugMetadata(c = "com.facebook.aura.explore.view.cards.IdeaIconCache$icon$result$1$1", f = "IdeaPreviewImageUrls.kt", l = {119}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.explore.view.cards.IdeaIconCache$icon$result$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super IdeaIcon>, Object> {
        public final /* synthetic */ String $cacheKey;
        public final /* synthetic */ HatchThumbnailDisplaySize $displaySize;
        public final /* synthetic */ String $ideaId;
        public int label;
        public final /* synthetic */ IdeaIconCache this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IdeaIconCache ideaIconCache, String str, String str2, HatchThumbnailDisplaySize hatchThumbnailDisplaySize, HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
            this.this$0 = ideaIconCache;
            this.$cacheKey = str;
            this.$ideaId = str2;
            this.$displaySize = hatchThumbnailDisplaySize;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass1(this.this$0, this.$cacheKey, this.$ideaId, this.$displaySize, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                IdeaIconCache ideaIconCache = this.this$0;
                String str = this.$cacheKey;
                String str2 = this.$ideaId;
                HatchThumbnailDisplaySize hatchThumbnailDisplaySize = this.$displaySize;
                this.label = 1;
                obj = ideaIconCache.fetchAndCache(str, str2, hatchThumbnailDisplaySize, this);
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
        public final Object invoke(HtJ<? super IdeaIcon> htJ) {
            return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaIconCache$icon$result$1(IdeaIconCache ideaIconCache, String str, String str2, HatchThumbnailDisplaySize hatchThumbnailDisplaySize, HtJ<? super IdeaIconCache$icon$result$1> htJ) {
        super(2, htJ);
        this.this$0 = ideaIconCache;
        this.$cacheKey = str;
        this.$ideaId = str2;
        this.$displaySize = hatchThumbnailDisplaySize;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new IdeaIconCache$icon$result$1(this.this$0, this.$cacheKey, this.$ideaId, this.$displaySize, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super SingleFlightResult<? extends IdeaIcon>> htJ) {
        return invoke2(c3ux, (HtJ<? super SingleFlightResult<IdeaIcon>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            IdeaIconCache ideaIconCache = this.this$0;
            SingleFlight singleFlight = ideaIconCache.singleFlight;
            String str = this.$cacheKey;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ideaIconCache, str, this.$ideaId, this.$displaySize, null);
            this.label = 1;
            obj = singleFlight.invoke(str, anonymousClass1, this);
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

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super SingleFlightResult<IdeaIcon>> htJ) {
        return ((IdeaIconCache$icon$result$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
