package com.facebook.aura.conversation.viewmodel;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC7549F2g;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class HatchConversationComposerController implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public boolean closed;
    public final Map<String, Owner> owners;

    public final class Owner {
        public final Function0<String> composerText;
        public final G0U<String, Unit> onDraft;
        public final G0U<String, Unit> onSend;

        public final Function0<String> getComposerText() {
            return this.composerText;
        }

        public final G0U<String, Unit> getOnDraft() {
            return this.onDraft;
        }

        public final G0U<String, Unit> getOnSend() {
            return this.onSend;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Owner(Function0<String> function0, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2) {
            AnonymousClass005.A0x(function0, g0u, g0u2);
            this.composerText = function0;
            this.onDraft = g0u;
            this.onSend = g0u2;
        }
    }

    public final class Companion {
        public final HatchConversationComposerController getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchConversationComposerController) abstractC3358CGz.A03(HatchConversationComposerController.class, HatchConversationComposerController$Companion$getInstance$1.INSTANCE);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        synchronized (this.owners) {
            this.closed = true;
            this.owners.clear();
        }
    }

    public HatchConversationComposerController() {
        this.owners = C3cG.A0j();
    }

    private final boolean withOwner(String str, G0U<? super Owner, Unit> g0u) {
        boolean z;
        Owner owner;
        if (!C3cH.A1K()) {
            throw BV4.A0S();
        }
        synchronized (this.owners) {
            z = false;
            if (!this.closed && (owner = this.owners.get(str)) != null) {
                g0u.invoke(owner);
                z = true;
            }
        }
        return z;
    }

    public final AutoCloseable register(final String str, Function0<String> function0, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2) {
        AnonymousClass005.A14(str, function0, g0u, g0u2);
        final Owner owner = new Owner(function0, g0u, g0u2);
        synchronized (this.owners) {
            if (!this.closed) {
                this.owners.put(str, owner);
            }
        }
        return new AutoCloseable() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationComposerController.register.2
            @Override // java.lang.AutoCloseable
            public final void close() {
                HatchConversationComposerController hatchConversationComposerController = HatchConversationComposerController.this;
                Map<String, Owner> map = hatchConversationComposerController.owners;
                String str2 = str;
                Owner owner2 = owner;
                synchronized (map) {
                    if (hatchConversationComposerController.owners.get(str2) == owner2) {
                        hatchConversationComposerController.owners.remove(str2);
                    }
                }
            }
        };
    }

    public final boolean requestDraft(String str, String str2) {
        boolean z;
        Owner owner;
        AnonymousClass003.A0u(str, str2);
        if (!C3cH.A1K()) {
            throw BV4.A0S();
        }
        synchronized (this.owners) {
            z = false;
            if (!this.closed && (owner = this.owners.get(str)) != null) {
                owner.onDraft.invoke(str2);
                z = true;
            }
        }
        return z;
    }

    public final boolean requestDraftReplacing(String str, String str2, String str3) {
        boolean z;
        Owner owner;
        AnonymousClass005.A0x(str, str2, str3);
        if (!C3cH.A1K()) {
            throw BV4.A0S();
        }
        synchronized (this.owners) {
            z = false;
            if (!this.closed && (owner = this.owners.get(str)) != null) {
                if (C7384Etj.areEqual(owner.composerText.invoke(), str2)) {
                    owner.onDraft.invoke(str3);
                }
                z = true;
            }
        }
        return z;
    }

    public final boolean requestSend(String str, String str2) {
        boolean z;
        Owner owner;
        AnonymousClass003.A0u(str, str2);
        if (!C3cH.A1K()) {
            throw BV4.A0S();
        }
        synchronized (this.owners) {
            z = false;
            if (!this.closed && (owner = this.owners.get(str)) != null) {
                owner.onSend.invoke(str2);
                z = true;
            }
        }
        return z;
    }

    public /* synthetic */ HatchConversationComposerController(C06H c06h) {
        this();
    }
}
