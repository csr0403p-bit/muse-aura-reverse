package com.facebook.aura.browsertask.data;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.browsertask.data.HatchComputerRepository", f = "HatchComputerRepository.kt", l = {HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS}, m = "loadContext-IoAF18A", v = 2)
/* loaded from: classes3.dex */
public final class HatchComputerRepository$loadContext$1 extends HzP {
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchComputerRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComputerRepository$loadContext$1(HatchComputerRepository hatchComputerRepository, HtJ<? super HatchComputerRepository$loadContext$1> htJ) {
        super(htJ);
        this.this$0 = hatchComputerRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m305loadContextIoAF18A(this));
    }
}
