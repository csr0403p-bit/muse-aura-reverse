package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.C06787bB;
import X.C7384Etj;
import X.G0U;
import X.HoC;
import X.InterfaceC06807bD;
import com.facebook.aura.email.viewmodel.EmailViewModel;

/* loaded from: classes.dex */
public final class EmailScreenKt$EmailScreen$3$1$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ EmailViewModel $model;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        this.$model.refresh();
        final HoC hoCObserveInboxConnection = this.$model.observeInboxConnection();
        return new InterfaceC06807bD() { // from class: com.facebook.aura.email.view.EmailScreenKt$EmailScreen$3$1$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
                hoCObserveInboxConnection.A5w(null);
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailScreenKt$EmailScreen$3$1$1(EmailViewModel emailViewModel) {
        super(1);
        this.$model = emailViewModel;
    }
}
