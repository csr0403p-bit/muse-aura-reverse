package X;

import com.google.common.collect.EvictingQueue;
import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.Sets$UnmodifiableNavigableSet;

/* renamed from: X.CNv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3450CNv {
    public String toString() {
        return (this instanceof ScheduledFutureC3449CNu ? ((ScheduledFutureC3449CNu) this).A00 : this instanceof DOU ? ((DOU) this).A01 : this instanceof Sets$UnmodifiableNavigableSet ? ((Sets$UnmodifiableNavigableSet) this).unmodifiableDelegate : this instanceof DOS ? ((DOS) this).A00.A00 : this instanceof EvictingQueue ? ((EvictingQueue) this).delegate : this instanceof C5036DPy ? ((C5036DPy) this).A03 : this instanceof E8R ? ((E8R) this).A00 : this instanceof MapMakerInternalMap.AbstractSerializationProxy ? ((MapMakerInternalMap.AbstractSerializationProxy) this).A00 : ((DND) this).A00).toString();
    }
}
