package com.facebook.aura.library.repo;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchFileOperations;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.library.repo.SharedRecentAndMediaFeed$refresh$2$mediaDeferred$1", f = "SharedRecentAndMediaFeed.kt", l = {137}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SharedRecentAndMediaFeed$refresh$2$mediaDeferred$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchFileOperations.LibraryResult>, Object> {
    public int label;
    public final /* synthetic */ SharedRecentAndMediaFeed this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedRecentAndMediaFeed$refresh$2$mediaDeferred$1(SharedRecentAndMediaFeed sharedRecentAndMediaFeed, HtJ<? super SharedRecentAndMediaFeed$refresh$2$mediaDeferred$1> htJ) {
        super(2, htJ);
        this.this$0 = sharedRecentAndMediaFeed;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SharedRecentAndMediaFeed$refresh$2$mediaDeferred$1(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchFileOperations.LibraryResult> htJ) {
        return new SharedRecentAndMediaFeed$refresh$2$mediaDeferred$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
            AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
            Integer numA0R = C3cG.A0R(10);
            this.label = 1;
            obj = hatchFileOperations.libraryFiles(HatchFileOperations.LibraryPreset.media, abstractC3358CGz, numA0R, null, this);
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
}
