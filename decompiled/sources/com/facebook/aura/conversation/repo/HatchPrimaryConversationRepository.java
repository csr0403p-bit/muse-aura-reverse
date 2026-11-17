package com.facebook.aura.conversation.repo;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.C06H;
import X.InterfaceC7549F2g;
import android.content.Context;

/* loaded from: classes.dex */
public final class HatchPrimaryConversationRepository implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final HatchConversationRepository repository;

    /* JADX WARN: Multi-variable type inference failed */
    public HatchPrimaryConversationRepository(Context context, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1b = AnonymousClass004.A1b(context, abstractC3358CGz);
        this.repository = new HatchConversationRepository(context, abstractC3358CGz, null, 0 == true ? 1 : 0, zA1b, zA1b, 56, 0 == true ? 1 : 0);
    }

    /* loaded from: classes2.dex */
    public final class Companion {
        public final HatchPrimaryConversationRepository getInstance(Context context, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(context, abstractC3358CGz);
            return (HatchPrimaryConversationRepository) abstractC3358CGz.A03(HatchPrimaryConversationRepository.class, new HatchPrimaryConversationRepository$Companion$getInstance$1(context, abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.repository.clearChat();
        this.repository.dispose();
    }

    public final HatchConversationRepository getRepository() {
        return this.repository;
    }
}
