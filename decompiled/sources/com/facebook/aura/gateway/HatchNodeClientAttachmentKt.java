package com.facebook.aura.gateway;

import X.HtJ;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinReminderContext;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository;
import com.facebook.aura.nodes.core.NodePinReminderPresenter;

/* loaded from: classes3.dex */
public abstract class HatchNodeClientAttachmentKt {
    public static final long BACKGROUND_CONNECT_WAIT_MS = 30000;

    /* renamed from: com.facebook.aura.gateway.HatchNodeClientAttachmentKt$pinReminderPresenter$1, reason: invalid class name */
    public final class AnonymousClass1 implements NodePinReminderPresenter {
        public final /* synthetic */ ConfidentialVmRepository $repository;

        public AnonymousClass1(ConfidentialVmRepository confidentialVmRepository) {
            this.$repository = confidentialVmRepository;
        }

        @Override // com.facebook.aura.nodes.core.NodePinReminderPresenter
        public Object present(String str, String str2, long j, long j2, HtJ<? super Boolean> htJ) {
            return this.$repository.onPinReminder(new ConfidentialVmPinReminderContext(str, str2, j), j2, htJ);
        }
    }

    public static final /* synthetic */ NodePinReminderPresenter access$pinReminderPresenter(ConfidentialVmRepository confidentialVmRepository) {
        return new AnonymousClass1(confidentialVmRepository);
    }

    public static final NodePinReminderPresenter pinReminderPresenter(ConfidentialVmRepository confidentialVmRepository) {
        return new AnonymousClass1(confidentialVmRepository);
    }
}
