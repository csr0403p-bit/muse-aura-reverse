package com.facebook.aura.status.repo;

import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.F60;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlinx.serialization.SerializationException;

/* loaded from: classes2.dex */
public final class ActivityEntryDomainSerializer implements C9hr<ActivityEntry> {
    public static final ActivityEntryDomainSerializer INSTANCE = new ActivityEntryDomainSerializer();
    public static final C9iZ descriptor = ActivityEntryJson$$serializer.descriptor;

    @Override // X.C9jG
    public ActivityEntry deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        return ((ActivityEntryJson) interfaceC07829iw.A8b(ActivityEntryJson$$serializer.INSTANCE)).toDomain();
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public C9iZ getDescriptor() {
        return descriptor;
    }

    public void serialize(InterfaceC07789is interfaceC07789is, ActivityEntry activityEntry) {
        throw new SerializationException("ActivityEntry is decode-only");
    }

    @Override // X.C9hv
    public /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        serialize(interfaceC07789is, (ActivityEntry) obj);
        throw F60.createAndThrow();
    }
}
