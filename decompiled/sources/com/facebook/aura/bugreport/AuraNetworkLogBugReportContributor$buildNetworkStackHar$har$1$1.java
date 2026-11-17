package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import X.C2nw;
import X.C60Q;
import X.C7384Etj;
import X.C7pd;
import X.C7qW;
import X.G0U;
import com.facebook.aura.notifications.push.AuraCvmPushReplayStore;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes3.dex */
public final class AuraNetworkLogBugReportContributor$buildNetworkStackHar$har$1$1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
    public final /* synthetic */ List<JsonElement> $applicationEntries;
    public final /* synthetic */ List<JsonElement> $connectionEvents;
    public final /* synthetic */ List<JsonElement> $nativeEntries;

    /* renamed from: com.facebook.aura.bugreport.AuraNetworkLogBugReportContributor$buildNetworkStackHar$har$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C7pd, Unit> {
        public final /* synthetic */ List<JsonElement> $applicationEntries;
        public final /* synthetic */ List<JsonElement> $nativeEntries;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C7pd c7pd) {
            C7384Etj.A0Y(c7pd, 0);
            Iterator<JsonElement> it = this.$nativeEntries.iterator();
            while (it.hasNext()) {
                c7pd.A06(C60Q.A11(it));
            }
            Iterator<JsonElement> it2 = this.$applicationEntries.iterator();
            while (it2.hasNext()) {
                c7pd.A06(C60Q.A11(it2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<? extends JsonElement> list, List<? extends JsonElement> list2) {
            super(1);
            this.$nativeEntries = list;
            this.$applicationEntries = list2;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C7pd c7pd) {
            invoke2(c7pd);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraNetworkLogBugReportContributor$buildNetworkStackHar$har$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<C7pd, Unit> {
        public final /* synthetic */ List<JsonElement> $connectionEvents;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C7pd c7pd) {
            C7384Etj.A0Y(c7pd, 0);
            Iterator<JsonElement> it = this.$connectionEvents.iterator();
            while (it.hasNext()) {
                c7pd.A06(C60Q.A11(it));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends JsonElement> list) {
            super(1);
            this.$connectionEvents = list;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C7pd c7pd) {
            invoke2(c7pd);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2nw c2nw) {
        C7384Etj.A0Y(c2nw, 0);
        C7qW.A06("version", "1.2", c2nw);
        C7qW.A07(AuraCvmPushReplayStore.ENTRIES_KEY, new AnonymousClass1(this.$nativeEntries, this.$applicationEntries), c2nw);
        if (this.$connectionEvents.isEmpty()) {
            return;
        }
        C7qW.A07("_connectionEvents", new AnonymousClass2(this.$connectionEvents), c2nw);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraNetworkLogBugReportContributor$buildNetworkStackHar$har$1$1(List<? extends JsonElement> list, List<? extends JsonElement> list2, List<? extends JsonElement> list3) {
        super(1);
        this.$connectionEvents = list;
        this.$nativeEntries = list2;
        this.$applicationEntries = list3;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
        invoke2(c2nw);
        return Unit.INSTANCE;
    }
}
