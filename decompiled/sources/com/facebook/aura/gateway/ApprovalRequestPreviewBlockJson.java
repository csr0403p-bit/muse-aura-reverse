package com.facebook.aura.gateway;

import X.C9hr;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlinx.serialization.Serializable;

@Serializable(with = ApprovalRequestPreviewBlockJsonSerializer.class)
/* loaded from: classes2.dex */
public interface ApprovalRequestPreviewBlockJson {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final C9hr<ApprovalRequestPreviewBlockJson> serializer() {
            return ApprovalRequestPreviewBlockJsonSerializer.INSTANCE;
        }
    }

    String getType();

    HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock toDomainOrNull();
}
