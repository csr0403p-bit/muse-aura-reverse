package com.facebook.aura.confidentialvm.repository;

import X.Hm1;

/* loaded from: classes4.dex */
public final class ConfidentialVmRepositoryKt$awaitResult$2$1 {
    public final /* synthetic */ Hm1<T> $cont;

    /* JADX WARN: Multi-variable type inference failed */
    public ConfidentialVmRepositoryKt$awaitResult$2$1(Hm1<? super T> hm1) {
        this.$cont = hm1;
    }

    public final void run(T t) {
        if (this.$cont.isActive()) {
            this.$cont.resumeWith(t);
        }
    }
}
