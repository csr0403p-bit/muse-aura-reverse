package com.facebook.aura.explore.view.cards;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.gateway.HatchThumbnailDisplaySize;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.explore.view.cards.IdeaPreviewImageUrlsKt$rememberIdeaIcon$1$1", f = "IdeaPreviewImageUrls.kt", l = {MessageDraftSenderKt.UNICODE_MULTIPART_CHARS}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class IdeaPreviewImageUrlsKt$rememberIdeaIcon$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchThumbnailDisplaySize $displaySize;
    public final /* synthetic */ MutableState<IdeaIcon> $fetchedIcon$delegate;
    public final /* synthetic */ String $ideaId;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPreviewImageUrlsKt$rememberIdeaIcon$1$1(AbstractC3358CGz abstractC3358CGz, String str, HatchThumbnailDisplaySize hatchThumbnailDisplaySize, MutableState<IdeaIcon> mutableState, HtJ<? super IdeaPreviewImageUrlsKt$rememberIdeaIcon$1$1> htJ) {
        super(2, htJ);
        this.$userSession = abstractC3358CGz;
        this.$ideaId = str;
        this.$displaySize = hatchThumbnailDisplaySize;
        this.$fetchedIcon$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new IdeaPreviewImageUrlsKt$rememberIdeaIcon$1$1(this.$userSession, this.$ideaId, this.$displaySize, this.$fetchedIcon$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            mutableState = this.$fetchedIcon$delegate;
            IdeaIconCache companion = IdeaIconCache.Companion.getInstance(this.$userSession);
            String str = this.$ideaId;
            HatchThumbnailDisplaySize hatchThumbnailDisplaySize = this.$displaySize;
            this.L$0 = mutableState;
            this.label = 1;
            obj = companion.icon(str, hatchThumbnailDisplaySize, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            mutableState = (MutableState) this.L$0;
            Hwg.A00(obj);
        }
        mutableState.Af8(obj);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((IdeaPreviewImageUrlsKt$rememberIdeaIcon$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
