package com.facebook.aura.conversation.widget.api;

import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.EnumC10460Hji;
import X.G0W;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.conversation.widget.api.ConversationTimelineContents$observe$sources$1$1", f = "ConversationTimelineContent.kt", l = {R.styleable.maplibre_MapView_maplibre_uiTiltGestures}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConversationTimelineContents$observe$sources$1$1 extends AbstractC07127nr implements G0W<C20Z<? super AHD<? extends ConversationTimelineContent>>, Throwable, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public int label;

    public ConversationTimelineContents$observe$sources$1$1(HtJ<? super ConversationTimelineContents$observe$sources$1$1> htJ) {
        super(3, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C20Z c20z = (C20Z) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AHI ahi = AHI.A01;
            this.L$0 = null;
            this.label = 1;
            if (c20z.emit(ahi, this) == enumC10460Hji) {
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

    @Override // X.G0W
    public final Object invoke(C20Z<? super AHD<? extends ConversationTimelineContent>> c20z, Throwable th, HtJ<? super Unit> htJ) {
        ConversationTimelineContents$observe$sources$1$1 conversationTimelineContents$observe$sources$1$1 = new ConversationTimelineContents$observe$sources$1$1(htJ);
        conversationTimelineContents$observe$sources$1$1.L$0 = c20z;
        return conversationTimelineContents$observe$sources$1$1.invokeSuspend(Unit.INSTANCE);
    }
}
