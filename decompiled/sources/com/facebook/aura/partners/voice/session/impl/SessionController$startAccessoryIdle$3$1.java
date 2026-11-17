package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.C10649I0t;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider;
import com.facebook.aura.partners.voice.session.impl.SessionController;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$startAccessoryIdle$3$1", f = "SessionController.kt", l = {2555, 2556}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$startAccessoryIdle$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchAvatarReferenceImageProvider $provider;
    public final /* synthetic */ SessionController.AccessoryVideo $video;
    public int label;
    public final /* synthetic */ SessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$startAccessoryIdle$3$1(HatchAvatarReferenceImageProvider hatchAvatarReferenceImageProvider, SessionController sessionController, SessionController.AccessoryVideo accessoryVideo, HtJ<? super SessionController$startAccessoryIdle$3$1> htJ) {
        super(2, htJ);
        this.$provider = hatchAvatarReferenceImageProvider;
        this.this$0 = sessionController;
        this.$video = accessoryVideo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SessionController$startAccessoryIdle$3$1(this.$provider, this.this$0, this.$video, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C10649I0t c10649I0t = new C10649I0t(this.$provider.readyCallIdle, 2);
            this.label = 1;
            if (AbstractC9777Gfy.A02(c10649I0t, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Unit.INSTANCE;
            }
            Hwg.A00(obj);
        }
        SessionController sessionController = this.this$0;
        SessionController.AccessoryVideo accessoryVideo = this.$video;
        this.label = 2;
        if (sessionController.startAccessoryIdle(accessoryVideo, this) == enumC10460Hji) {
            return enumC10460Hji;
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((SessionController$startAccessoryIdle$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
