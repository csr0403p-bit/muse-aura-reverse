package com.facebook.aura.library.repo;

import X.A3Y;
import X.A3Z;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BLG;
import X.C06H;
import X.C10571Hud;
import X.C1BN;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C6ys;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.C9258GBl;
import X.C9286GCn;
import X.C9hr;
import X.C9sU;
import X.CFK;
import X.EnumC10460Hji;
import X.F0C;
import X.F60;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.InterfaceC2261BLa;
import X.InterfaceC7549F2g;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class ArtifactsDataSource implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<Boolean> _hasLoaded;
    public final BLG<AHD<ArtifactItem>> _items;
    public final C1BN<Boolean> hasLoaded;
    public final C1BN<AHD<ArtifactItem>> items;
    public final InterfaceC2261BLa pinMutex;
    public final C3UX scope;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.library.repo.ArtifactsDataSource$observeGateway$1", f = "ArtifactsDataSource.kt", l = {MessageDraftSenderKt.UNICODE_MULTIPART_CHARS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.ArtifactsDataSource$observeGateway$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public int label;
        public final /* synthetic */ ArtifactsDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchGatewayConnection hatchGatewayConnection, ArtifactsDataSource artifactsDataSource, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
            this.this$0 = artifactsDataSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$gateway, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<JsonObject> c22i = this.$gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().artifactsSnapshotEvents;
                final ArtifactsDataSource artifactsDataSource = this.this$0;
                C20Z<? super JsonObject> c20z = new C20Z() { // from class: com.facebook.aura.library.repo.ArtifactsDataSource.observeGateway.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        artifactsDataSource.applySnapshot((JsonObject) obj2);
                        return Unit.INSTANCE;
                    }

                    public final Object emit(JsonObject jsonObject, HtJ<? super Unit> htJ) {
                        artifactsDataSource.applySnapshot(jsonObject);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.ArtifactsDataSource$observeGateway$2", f = "ArtifactsDataSource.kt", l = {68}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.ArtifactsDataSource$observeGateway$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public int label;
        public final /* synthetic */ ArtifactsDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchGatewayConnection hatchGatewayConnection, ArtifactsDataSource artifactsDataSource, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
            this.this$0 = artifactsDataSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$gateway, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<JsonObject> c22i = this.$gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().artifactItemsUpdated;
                final ArtifactsDataSource artifactsDataSource = this.this$0;
                C20Z<? super JsonObject> c20z = new C20Z() { // from class: com.facebook.aura.library.repo.ArtifactsDataSource.observeGateway.2.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        artifactsDataSource.applyItemUpdate((JsonObject) obj2);
                        return Unit.INSTANCE;
                    }

                    public final Object emit(JsonObject jsonObject, HtJ<? super Unit> htJ) {
                        artifactsDataSource.applyItemUpdate(jsonObject);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.ArtifactsDataSource$observeGateway$3", f = "ArtifactsDataSource.kt", l = {69}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.ArtifactsDataSource$observeGateway$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public int label;
        public final /* synthetic */ ArtifactsDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchGatewayConnection hatchGatewayConnection, ArtifactsDataSource artifactsDataSource, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
            this.this$0 = artifactsDataSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$gateway, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<JsonObject> c22i = this.$gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().artifactItemsRemoved;
                final ArtifactsDataSource artifactsDataSource = this.this$0;
                C20Z<? super JsonObject> c20z = new C20Z() { // from class: com.facebook.aura.library.repo.ArtifactsDataSource.observeGateway.3.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        artifactsDataSource.applyItemRemoval((JsonObject) obj2);
                        return Unit.INSTANCE;
                    }

                    public final Object emit(JsonObject jsonObject, HtJ<? super Unit> htJ) {
                        artifactsDataSource.applyItemRemoval(jsonObject);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0p();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.ArtifactsDataSource$observeGateway$4", f = "ArtifactsDataSource.kt", l = {MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.repo.ArtifactsDataSource$observeGateway$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchGatewayConnection hatchGatewayConnection, HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
            this.$gateway = hatchGatewayConnection;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass4(this.$gateway, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass4(this.$gateway, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGatewayConnection hatchGatewayConnection = this.$gateway;
                this.label = 1;
                if (hatchGatewayConnection.subscribeArtifacts(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.ArtifactsDataSource", f = "ArtifactsDataSource.kt", l = {255, 153}, m = "pinToTop", v = 2)
    /* renamed from: com.facebook.aura.library.repo.ArtifactsDataSource$pinToTop$2, reason: invalid class name and case insensitive filesystem */
    public final class C122742 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C122742(HtJ<? super C122742> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ArtifactsDataSource.this.pinToTop(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.ArtifactsDataSource", f = "ArtifactsDataSource.kt", l = {255}, m = "setPinned", v = 2)
    /* renamed from: com.facebook.aura.library.repo.ArtifactsDataSource$setPinned$2, reason: invalid class name and case insensitive filesystem */
    public final class C122752 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C122752(HtJ<? super C122752> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ArtifactsDataSource.this.setPinned(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.ArtifactsDataSource", f = "ArtifactsDataSource.kt", l = {255}, m = "touchRecent", v = 2)
    /* renamed from: com.facebook.aura.library.repo.ArtifactsDataSource$touchRecent$2, reason: invalid class name and case insensitive filesystem */
    public final class C122762 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C122762(HtJ<? super C122762> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ArtifactsDataSource.this.touchRecent(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.repo.ArtifactsDataSource", f = "ArtifactsDataSource.kt", l = {SelfieSnapshotKt.SELFIE_JPEG_QUALITY, 109}, m = "touchRecentForSpace", v = 2)
    /* renamed from: com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$1, reason: invalid class name and case insensitive filesystem */
    public final class C122771 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C122771(HtJ<? super C122771> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ArtifactsDataSource.this.touchRecentForSpace(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyItemUpdate(JsonObject jsonObject) {
        Object objA0s;
        try {
            ArtifactItemJson artifactItemJson = ((ArtifactItemUpdatedJson) HatchJsonKt.HatchJson.A01(ArtifactItemUpdatedJson$$serializer.INSTANCE, jsonObject)).item;
            objA0s = artifactItemJson != null ? artifactItemJson.toDomain() : null;
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Throwable thA00 = HsJ.A00(objA0s);
        if (thA00 != null) {
            CFK.A06(ArtifactsDataSourceKt.TAG, FGI.A0M("Failed to decode artifact item update: ", thA00.getMessage()));
        }
        ArtifactItem artifactItem = (ArtifactItem) (objA0s instanceof C10571Hud ? null : objA0s);
        if (artifactItem != null) {
            patchItem(artifactItem);
        }
    }

    public final Object unpin(ArtifactSource artifactSource, String str, HtJ<? super Boolean> htJ) {
        return setPinned(artifactSource, str, null, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyItemRemoval(JsonObject jsonObject) {
        Object objA0s;
        ArtifactSource artifactSourceFromWire;
        try {
            objA0s = (ArtifactItemRemovedJson) HatchJsonKt.HatchJson.A01(ArtifactItemRemovedJson$$serializer.INSTANCE, jsonObject);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Throwable thA00 = HsJ.A00(objA0s);
        if (thA00 != null) {
            CFK.A06(ArtifactsDataSourceKt.TAG, FGI.A0M("Failed to decode artifact item removal: ", thA00.getMessage()));
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        ArtifactItemRemovedJson artifactItemRemovedJson = (ArtifactItemRemovedJson) objA0s;
        if (artifactItemRemovedJson == null || (artifactSourceFromWire = ArtifactSource.Companion.fromWire(artifactItemRemovedJson.source)) == null) {
            return;
        }
        String str = artifactItemRemovedJson.item_key;
        if (str.length() != 0) {
            removeItem(artifactSourceFromWire, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applySnapshot(JsonObject jsonObject) {
        Object objA0s;
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            F0C<C9hr<Object>>[] f0cArr = ArtifactsSubscribeResponseJson.$childSerializers;
            objA0s = (ArtifactsSubscribeResponseJson) c9sU.A01(ArtifactsSubscribeResponseJson$$serializer.INSTANCE, jsonObject);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Throwable thA00 = HsJ.A00(objA0s);
        if (thA00 != null) {
            C3cG.A1G("Failed to decode artifacts snapshot: ", thA00.getMessage(), ArtifactsDataSourceKt.TAG);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        ArtifactsSubscribeResponseJson artifactsSubscribeResponseJson = (ArtifactsSubscribeResponseJson) objA0s;
        if (artifactsSubscribeResponseJson != null) {
            BLG<AHD<ArtifactItem>> blg = this._items;
            List<ArtifactItemJson> list = artifactsSubscribeResponseJson.items;
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<ArtifactItemJson> it = list.iterator();
            while (it.hasNext()) {
                ArtifactItem domain = it.next().toDomain();
                if (domain != null) {
                    arrayListA0h.add(domain);
                }
            }
            C60O.A1L(arrayListA0h, blg);
            AnonymousClass004.A1D(true, this._hasLoaded);
            C60O.A17(this._items).size();
            Iterable iterableA0j = C60O.A0j(this._items);
            int i = 0;
            if (!(iterableA0j instanceof Collection) || !C3cG.A1N(iterableA0j)) {
                Iterator it2 = iterableA0j.iterator();
                while (it2.hasNext()) {
                    ArtifactSource artifactSource = ((ArtifactItem) it2.next()).source;
                    if (artifactSource == ArtifactSource.SPACE || artifactSource == ArtifactSource.SAVED_SPACE) {
                        i++;
                        if (i < 0) {
                            AbstractC0885AGm.A13();
                            throw F60.createAndThrow();
                        }
                    }
                }
            }
            artifactsSubscribeResponseJson.items.size();
            C60O.A17(this._items).size();
            final List<ArtifactItemJson> list2 = artifactsSubscribeResponseJson.items;
            A3Z.A00(new A3Y<ArtifactItemJson, String>() { // from class: com.facebook.aura.library.repo.ArtifactsDataSource$applySnapshot$$inlined$groupingBy$1
                @Override // X.A3Y
                public String keyOf(ArtifactItemJson artifactItemJson) {
                    return artifactItemJson.source;
                }

                @Override // X.A3Y
                public Iterator<ArtifactItemJson> sourceIterator() {
                    return list2.iterator();
                }
            });
        }
    }

    private final void observeGateway() {
        HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(this.userSession);
        C3UX c3ux = this.scope;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(gateway, this, null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, anonymousClass1, c3ux);
        GAo.A02(num, c6ys, new AnonymousClass2(gateway, this, null), this.scope);
        GAo.A02(num, c6ys, new AnonymousClass3(gateway, this, null), this.scope);
        GAo.A02(num, c6ys, new AnonymousClass4(gateway, null), this.scope);
    }

    private final void patchItem(ArtifactItem artifactItem) {
        AHD<ArtifactItem> value;
        ArrayList arrayListA0i;
        BLG<AHD<ArtifactItem>> blg = this._items;
        do {
            value = blg.getValue();
            AHD<ArtifactItem> ahd = value;
            if ((ahd instanceof Collection) && ahd.isEmpty()) {
                arrayListA0i = AbstractC0878AGe.A0Q(artifactItem, ahd);
            } else {
                for (ArtifactItem artifactItem2 : ahd) {
                    if (artifactItem2.source == artifactItem.source && C7384Etj.areEqual(artifactItem2.itemKey, artifactItem.itemKey)) {
                        arrayListA0i = AnonymousClass003.A0i(ahd);
                        for (ArtifactItem artifactItem3 : ahd) {
                            if (artifactItem3.source == artifactItem.source && C7384Etj.areEqual(artifactItem3.itemKey, artifactItem.itemKey)) {
                                artifactItem3 = artifactItem;
                            }
                            arrayListA0i.add(artifactItem3);
                        }
                    }
                }
                arrayListA0i = AbstractC0878AGe.A0Q(artifactItem, ahd);
            }
        } while (!blg.A6e(value, AGI.A07(arrayListA0i)));
    }

    private final void reconcileSingleItemResponse(JsonElement jsonElement) {
        JsonObject jsonObjectAsJsonObjectOrNull;
        JsonObject jsonObjectA1J;
        Object objA0s;
        if (jsonElement == null || (jsonObjectAsJsonObjectOrNull = JsonObjectExtensionsKt.asJsonObjectOrNull(jsonElement)) == null || (jsonObjectA1J = C60O.A1J(jsonObjectAsJsonObjectOrNull)) == null) {
            return;
        }
        try {
            ArtifactItemJson artifactItemJson = ((ArtifactItemUpdatedJson) HatchJsonKt.HatchJson.A01(ArtifactItemUpdatedJson$$serializer.INSTANCE, jsonObjectA1J)).item;
            objA0s = artifactItemJson != null ? artifactItemJson.toDomain() : null;
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        ArtifactItem artifactItem = (ArtifactItem) (objA0s instanceof C10571Hud ? null : objA0s);
        if (artifactItem != null) {
            patchItem(artifactItem);
        }
    }

    private final void removeItem(ArtifactSource artifactSource, String str) {
        AHD<ArtifactItem> value;
        ArrayList arrayListA0h;
        BLG<AHD<ArtifactItem>> blg = this._items;
        do {
            value = blg.getValue();
            arrayListA0h = C3cG.A0h();
            for (Object obj : value) {
                ArtifactItem artifactItem = (ArtifactItem) obj;
                if (artifactItem.source != artifactSource || !C7384Etj.areEqual(artifactItem.itemKey, str)) {
                    arrayListA0h.add(obj);
                }
            }
        } while (!blg.A6e(value, AGI.A07(arrayListA0h)));
    }

    public final void applySpaceRename(String str, String str2) {
        AHD<ArtifactItem> value;
        ArrayList arrayListA0i;
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        BLG<AHD<ArtifactItem>> blg = this._items;
        do {
            value = blg.getValue();
            AHD<ArtifactItem> ahd = value;
            arrayListA0i = AnonymousClass003.A0i(ahd);
            for (ArtifactItem artifactItemCopy$default : ahd) {
                if (artifactItemCopy$default.source == ArtifactSource.SPACE && str.equals(artifactItemCopy$default.itemKey)) {
                    artifactItemCopy$default = ArtifactItem.copy$default(artifactItemCopy$default, null, null, str2, null, null, zA1b, null, null, null, null, null, null, null, null, null, null, null, 131067, null);
                }
                arrayListA0i.add(artifactItemCopy$default);
            }
        } while (!blg.A6e(value, AGI.A07(arrayListA0i)));
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
        this._items.Af8(AHI.A01);
        AnonymousClass003.A14(this._hasLoaded, false);
    }

    public final C1BN<Boolean> getHasLoaded() {
        return this.hasLoaded;
    }

    public final C1BN<AHD<ArtifactItem>> getItems() {
        return this.items;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pinToTop(com.facebook.aura.library.repo.ArtifactSource r12, java.lang.String r13, X.HtJ<? super java.lang.Boolean> r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.facebook.aura.library.repo.ArtifactsDataSource.C122742
            if (r0 == 0) goto L27
            r7 = r14
            com.facebook.aura.library.repo.ArtifactsDataSource$pinToTop$2 r7 = (com.facebook.aura.library.repo.ArtifactsDataSource.C122742) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r0 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r2 = r7.label
            r6 = 2
            r1 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r1) goto L32
            if (r2 != r6) goto L2d
            java.lang.Object r4 = r7.L$2
            X.BLa r4 = (X.InterfaceC2261BLa) r4
            goto Lcb
        L27:
            com.facebook.aura.library.repo.ArtifactsDataSource$pinToTop$2 r7 = new com.facebook.aura.library.repo.ArtifactsDataSource$pinToTop$2
            r7.<init>(r14)
            goto L12
        L2d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L32:
            java.lang.Object r4 = r7.L$2
            X.BLa r4 = (X.InterfaceC2261BLa) r4
            java.lang.Object r13 = r7.L$1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r7.L$0
            com.facebook.aura.library.repo.ArtifactSource r12 = (com.facebook.aura.library.repo.ArtifactSource) r12
            X.Hwg.A00(r0)
            goto L56
        L42:
            X.Hwg.A00(r0)
            X.BLa r4 = r11.pinMutex
            r7.L$0 = r12
            r7.L$1 = r13
            r7.L$2 = r4
            r7.label = r1
            java.lang.Object r0 = r4.APs(r5, r7)
            if (r0 != r8) goto L56
            return r8
        L56:
            X.BLG<X.AHD<com.facebook.aura.library.repo.ArtifactItem>> r0 = r11._items     // Catch: java.lang.Throwable -> Ld6
            java.lang.Iterable r0 = X.C60O.A0j(r0)     // Catch: java.lang.Throwable -> Ld6
            java.util.ArrayList r2 = X.C3cG.A0h()     // Catch: java.lang.Throwable -> Ld6
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> Ld6
        L64:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto L78
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Ld6
            com.facebook.aura.library.repo.ArtifactItem r0 = (com.facebook.aura.library.repo.ArtifactItem) r0     // Catch: java.lang.Throwable -> Ld6
            java.lang.Double r0 = r0.favoriteOrder     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto L64
            r2.add(r0)     // Catch: java.lang.Throwable -> Ld6
            goto L64
        L78:
            java.util.Iterator r9 = r2.iterator()     // Catch: java.lang.Throwable -> Ld6
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> Ld6
            if (r0 != 0) goto L83
            goto La7
        L83:
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> Ld6
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> Ld6
            double r2 = r0.doubleValue()     // Catch: java.lang.Throwable -> Ld6
        L8d:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto La2
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> Ld6
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> Ld6
            double r0 = r0.doubleValue()     // Catch: java.lang.Throwable -> Ld6
            double r2 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> Ld6
            goto L8d
        La2:
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch: java.lang.Throwable -> Ld6
            goto La8
        La7:
            r0 = 0
        La8:
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 == 0) goto Lad
            goto Lb0
        Lad:
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto Lb4
        Lb0:
            double r1 = r0.doubleValue()     // Catch: java.lang.Throwable -> Ld6
        Lb4:
            double r1 = r1 - r9
            java.lang.Double r0 = new java.lang.Double     // Catch: java.lang.Throwable -> Ld6
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld6
            r7.L$0 = r5     // Catch: java.lang.Throwable -> Ld6
            r7.L$1 = r5     // Catch: java.lang.Throwable -> Ld6
            r7.L$2 = r4     // Catch: java.lang.Throwable -> Ld6
            r7.L$3 = r5     // Catch: java.lang.Throwable -> Ld6
            r7.label = r6     // Catch: java.lang.Throwable -> Ld6
            java.lang.Object r0 = r11.setPinned(r12, r13, r0, r7)     // Catch: java.lang.Throwable -> Ld6
            if (r0 != r8) goto Lce
            return r8
        Lcb:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> Ld4
        Lce:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Ld4
            r4.Ahe(r5)
            return r0
        Ld4:
            r0 = move-exception
            goto Ld7
        Ld6:
            r0 = move-exception
        Ld7:
            r4.Ahe(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.ArtifactsDataSource.pinToTop(com.facebook.aura.library.repo.ArtifactSource, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final Object refresh(HtJ<? super Unit> htJ) {
        return C3cG.A0U(HatchGatewayServiceManager.INSTANCE.getGateway(this.userSession).subscribeArtifacts(htJ));
    }

    public final Object setPinned(ArtifactItem artifactItem, Double d, HtJ<? super Boolean> htJ) {
        return setPinned(artifactItem.source, artifactItem.itemKey, d, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object touchRecent(com.facebook.aura.library.repo.ArtifactSource r12, java.lang.String r13, X.HtJ<? super kotlin.Unit> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.facebook.aura.library.repo.ArtifactsDataSource.C122762
            if (r0 == 0) goto L64
            r10 = r14
            com.facebook.aura.library.repo.ArtifactsDataSource$touchRecent$2 r10 = (com.facebook.aura.library.repo.ArtifactsDataSource.C122762) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r10.label = r2
        L12:
            java.lang.Object r1 = r10.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r10.label
            r5 = 1
            if (r0 == 0) goto L28
            if (r0 != r5) goto L6a
            X.Hwg.A00(r1)
        L20:
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1
            r11.reconcileSingleItemResponse(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L28:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.service.HatchGatewayServiceManager r1 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE
            X.CGz r0 = r11.userSession
            com.facebook.aura.gateway.HatchGatewayConnection r3 = r1.getGateway(r0)
            com.facebook.aura.network.api.RpcMethod$ArtifactRecentsTouch r6 = com.facebook.aura.network.api.RpcMethod.ArtifactRecentsTouch.INSTANCE
            java.lang.String r0 = r12.getWire()
            com.facebook.aura.library.repo.ArtifactRecentsTouchRequestJson r2 = new com.facebook.aura.library.repo.ArtifactRecentsTouchRequestJson
            r2.<init>(r0, r13)
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson
            com.facebook.aura.library.repo.ArtifactRecentsTouchRequestJson$$serializer r0 = com.facebook.aura.library.repo.ArtifactRecentsTouchRequestJson$$serializer.INSTANCE
            java.lang.String r7 = r1.A02(r2, r0)
            r0 = 0
            r10.L$0 = r0
            r10.L$1 = r0
            r10.L$2 = r0
            r10.L$3 = r0
            r10.L$4 = r0
            r10.L$5 = r0
            r8 = 15000(0x3a98, double:7.411E-320)
            r10.J$0 = r8
            r10.label = r5
            com.facebook.aura.gateway.HatchGatewayEventsHandler r5 = r3.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway()
            java.lang.Object r1 = r5.sendRequestAndWaitInternal(r6, r7, r8, r10)
            if (r1 != r4) goto L20
            return r4
        L64:
            com.facebook.aura.library.repo.ArtifactsDataSource$touchRecent$2 r10 = new com.facebook.aura.library.repo.ArtifactsDataSource$touchRecent$2
            r10.<init>(r14)
            goto L12
        L6a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.ArtifactsDataSource.touchRecent(com.facebook.aura.library.repo.ArtifactSource, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object touchRecentForSpace(java.lang.String r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.library.repo.ArtifactsDataSource.C122771
            if (r0 == 0) goto L58
            r5 = r8
            com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$1 r5 = (com.facebook.aura.library.repo.ArtifactsDataSource.C122771) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r2 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 == r1) goto L3c
            if (r0 != r3) goto L5e
            X.Hwg.A00(r2)
        L23:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L26:
            X.Hwg.A00(r2)
            r0 = 0
            com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1 r2 = new com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1
            r2.<init>(r6, r7, r0)
            r5.L$0 = r7
            r5.label = r1
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r2 = X.GAX.A01(r5, r2, r0)
            if (r2 != r4) goto L42
            return r4
        L3c:
            java.lang.Object r0 = r5.L$0
            java.lang.String r7 = X.C3cG.A0d(r0, r2)
        L42:
            com.facebook.aura.library.repo.ArtifactSource r2 = (com.facebook.aura.library.repo.ArtifactSource) r2
            if (r2 == 0) goto L23
            com.facebook.aura.library.repo.ArtifactSource r0 = com.facebook.aura.library.repo.ArtifactSource.SAVED_SPACE
            if (r2 != r0) goto L23
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r3
            java.lang.Object r0 = r6.touchRecent(r2, r7, r5)
            if (r0 != r4) goto L23
            return r4
        L58:
            com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$1 r5 = new com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$1
            r5.<init>(r8)
            goto L12
        L5e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.ArtifactsDataSource.touchRecentForSpace(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final ArtifactsDataSource getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ArtifactsDataSource) abstractC3358CGz.A03(ArtifactsDataSource.class, new ArtifactsDataSource$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ArtifactsDataSource(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.scope = C78T.A01(AnonymousClass001.A0y(), null);
        C9286GCn c9286GCnA01 = HnJ.A01(AHI.A01);
        this._items = c9286GCnA01;
        this.items = C3cG.A11(c9286GCnA01);
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        this._hasLoaded = c9286GCnA0v;
        this.hasLoaded = C3cG.A11(c9286GCnA0v);
        this.pinMutex = new C9258GBl();
        observeGateway();
    }

    public /* synthetic */ ArtifactsDataSource(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public final Object pinToTop(ArtifactItem artifactItem, HtJ<? super Boolean> htJ) {
        return pinToTop(artifactItem.source, artifactItem.itemKey, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setPinned(com.facebook.aura.library.repo.ArtifactSource r12, java.lang.String r13, java.lang.Double r14, X.HtJ<? super java.lang.Boolean> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.facebook.aura.library.repo.ArtifactsDataSource.C122752
            if (r0 == 0) goto L6b
            r10 = r15
            com.facebook.aura.library.repo.ArtifactsDataSource$setPinned$2 r10 = (com.facebook.aura.library.repo.ArtifactsDataSource.C122752) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r10.label = r2
        L12:
            java.lang.Object r1 = r10.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r10.label
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L71
            X.Hwg.A00(r1)
        L20:
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1
            r11.reconcileSingleItemResponse(r1)
            if (r1 != 0) goto L28
            r3 = 0
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L2d:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.service.HatchGatewayServiceManager r1 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE
            X.CGz r0 = r11.userSession
            com.facebook.aura.gateway.HatchGatewayConnection r5 = r1.getGateway(r0)
            com.facebook.aura.network.api.RpcMethod$ArtifactPinnedSet r6 = com.facebook.aura.network.api.RpcMethod.ArtifactPinnedSet.INSTANCE
            java.lang.String r0 = r12.getWire()
            com.facebook.aura.library.repo.ArtifactPinnedSetRequestJson r2 = new com.facebook.aura.library.repo.ArtifactPinnedSetRequestJson
            r2.<init>(r0, r13, r14)
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson
            com.facebook.aura.library.repo.ArtifactPinnedSetRequestJson$$serializer r0 = com.facebook.aura.library.repo.ArtifactPinnedSetRequestJson$$serializer.INSTANCE
            java.lang.String r7 = r1.A02(r2, r0)
            r0 = 0
            r10.L$0 = r0
            r10.L$1 = r0
            r10.L$2 = r0
            r10.L$3 = r0
            r10.L$4 = r0
            r10.L$5 = r0
            r10.L$6 = r0
            r8 = 15000(0x3a98, double:7.411E-320)
            r10.J$0 = r8
            r10.label = r3
            com.facebook.aura.gateway.HatchGatewayEventsHandler r5 = r5.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway()
            java.lang.Object r1 = r5.sendRequestAndWaitInternal(r6, r7, r8, r10)
            if (r1 != r4) goto L20
            return r4
        L6b:
            com.facebook.aura.library.repo.ArtifactsDataSource$setPinned$2 r10 = new com.facebook.aura.library.repo.ArtifactsDataSource$setPinned$2
            r10.<init>(r15)
            goto L12
        L71:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.ArtifactsDataSource.setPinned(com.facebook.aura.library.repo.ArtifactSource, java.lang.String, java.lang.Double, X.HtJ):java.lang.Object");
    }

    public final Object touchRecent(ArtifactItem artifactItem, HtJ<? super Unit> htJ) {
        return C3cG.A0U(touchRecent(artifactItem.source, artifactItem.itemKey, htJ));
    }

    public final Object unpin(ArtifactItem artifactItem, HtJ<? super Boolean> htJ) {
        return setPinned(artifactItem, null, htJ);
    }
}
