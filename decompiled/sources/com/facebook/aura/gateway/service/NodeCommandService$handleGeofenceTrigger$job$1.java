package com.facebook.aura.gateway.service;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.commands.location.LocationDataSource;
import com.facebook.aura.nodes.transport.HatchNodeOperationLease;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.service.NodeCommandService$handleGeofenceTrigger$job$1", f = "NodeCommandService.kt", l = {215, 225, 225}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class NodeCommandService$handleGeofenceTrigger$job$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $geofenceId;
    public final /* synthetic */ String $geofenceName;
    public final /* synthetic */ double $latitude;
    public final /* synthetic */ double $longitude;
    public final /* synthetic */ int $startId;
    public final /* synthetic */ String $triggerType;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public Object L$0;
    public int label;
    public final /* synthetic */ NodeCommandService this$0;

    @DebugMetadata(c = "com.facebook.aura.gateway.service.NodeCommandService$handleGeofenceTrigger$job$1$1", f = "NodeCommandService.kt", l = {HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.service.NodeCommandService$handleGeofenceTrigger$job$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $geofenceName;
        public final /* synthetic */ double $latitude;
        public final /* synthetic */ double $longitude;
        public final /* synthetic */ String $triggerType;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC3358CGz abstractC3358CGz, double d, double d2, String str, String str2, HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
            this.$userSession = abstractC3358CGz;
            this.$latitude = d;
            this.$longitude = d2;
            this.$geofenceName = str;
            this.$triggerType = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass1(this.$userSession, this.$latitude, this.$longitude, this.$geofenceName, this.$triggerType, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return obj;
            }
            Hwg.A00(obj);
            LocationDataSource locationDataSource = LocationDataSource.INSTANCE;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            double d = this.$latitude;
            double d2 = this.$longitude;
            String str = this.$geofenceName;
            String str2 = this.$triggerType;
            this.label = 1;
            Object objPublishNow = locationDataSource.publishNow(abstractC3358CGz, d, d2, str, str2, null, null, false, this);
            return objPublishNow == enumC10460Hji ? enumC10460Hji : objPublishNow;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Boolean> htJ) {
            return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCommandService$handleGeofenceTrigger$job$1(String str, NodeCommandService nodeCommandService, int i, AbstractC3358CGz abstractC3358CGz, double d, double d2, String str2, String str3, HtJ<? super NodeCommandService$handleGeofenceTrigger$job$1> htJ) {
        super(2, htJ);
        this.$geofenceId = str;
        this.this$0 = nodeCommandService;
        this.$startId = i;
        this.$userSession = abstractC3358CGz;
        this.$latitude = d;
        this.$longitude = d2;
        this.$geofenceName = str2;
        this.$triggerType = str3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NodeCommandService$handleGeofenceTrigger$job$1(this.$geofenceId, this.this$0, this.$startId, this.$userSession, this.$latitude, this.$longitude, this.$geofenceName, this.$triggerType, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                HatchNodeOperationLease hatchNodeOperationLease = HatchNodeOperationLease.INSTANCE;
                String strA0M = FGI.A0M("geofence:", this.$geofenceId);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$userSession, this.$latitude, this.$longitude, this.$geofenceName, this.$triggerType, null);
                this.label = 1;
                if (hatchNodeOperationLease.withLease(strA0M, anonymousClass1, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        Hwg.A00(obj);
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw AnonymousClass001.A0n();
                    }
                    Throwable th = (Throwable) this.L$0;
                    Hwg.A00(obj);
                    throw th;
                }
                Hwg.A00(obj);
            }
            NodeCommandService nodeCommandService = this.this$0;
            int i2 = this.$startId;
            this.label = 2;
            if (nodeCommandService.finishJob(i2, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            NodeCommandService nodeCommandService2 = this.this$0;
            int i3 = this.$startId;
            this.L$0 = th2;
            this.label = 3;
            if (nodeCommandService2.finishJob(i3, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            throw th2;
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((NodeCommandService$handleGeofenceTrigger$job$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
