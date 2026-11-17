package com.facebook.aura.commands.contacts;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BQG;
import X.C2nw;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7pd;
import X.C7qW;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.net.Uri;
import android.provider.ContactsContract;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.nodes.datasource.DataSource;
import com.facebook.aura.nodes.datasource.DataSourceContext;
import com.facebook.aura.nodes.datasource.DataSourcePublishPipeline;
import com.facebook.aura.nodes.datasource.DataSourceResult;
import com.facebook.aura.nodes.datasource.NodeSyncBaselineStore;
import com.facebook.aura.nodes.datasource.NodeSyncDiff;
import com.facebook.aura.nodes.datasource.PagedBackfillStrategy;
import com.facebook.aura.nodes.datasource.ProactiveDelivery;
import com.facebook.aura.nodes.datasource.ProactiveTrigger;
import com.facebook.aura.nodes.registry.HatchDataSourceRegistration;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class ContactsDataSource implements DataSource, HatchDataSourceRegistration {
    public static final String BASELINE_FINGERPRINT = "contacts_v1";
    public static final int CONTACTS_PAGE_SIZE = 200;
    public static final int DELTA_BATCH_SIZE = 200;
    public static final int HASH_LENGTH = 16;
    public static final int MAX_TRACKED_CONTACTS = 20000;
    public static final String WALK_ROW_COUNT_KEY = "contact_row_count";
    public static final String WALK_WATERMARK_DATATYPE = "contacts_probe";
    public static final String WALK_WATERMARK_KEY = "last_walk_ms";
    public static final String description = "Device contacts (display name, phone numbers, email, address, organization). Each phone, email, and address carries a `label` describing its kind. That label is resolved by Android in the DEVICE's language, so on a non-English device it reads \"Portable\" or \"\u81ea\u5b85\" rather than \"Mobile\" or \"Home\" \u2014 match it by meaning, and when you cannot tell, ask the user which number to use rather than guessing.";
    public static final boolean emitsProactively = true;
    public static final ProactiveTrigger proactiveTrigger;
    public static final String sourceId = "contacts";
    public static final boolean supportsBackfill = true;
    public static final ContactsDataSource INSTANCE = new ContactsDataSource();
    public static final List<String> permissionRequired = Collections.singletonList("android.permission.READ_CONTACTS");

    public final class ContactsBackfillStrategy implements PagedBackfillStrategy {
        public final int pageSize = 200;

        /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
        @Override // com.facebook.aura.nodes.datasource.PagedBackfillStrategy
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object page(long r10, int r12, X.HtJ<? super com.facebook.aura.nodes.datasource.BackfillPage> r13) {
            /*
                r9 = this;
                r7 = r10
                boolean r0 = r13 instanceof com.facebook.aura.commands.contacts.ContactsDataSource$ContactsBackfillStrategy$page$1
                if (r0 == 0) goto L22
                r10 = r13
                com.facebook.aura.commands.contacts.ContactsDataSource$ContactsBackfillStrategy$page$1 r10 = (com.facebook.aura.commands.contacts.ContactsDataSource$ContactsBackfillStrategy$page$1) r10
                int r2 = r10.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L22
                int r2 = r2 - r1
                r10.label = r2
            L13:
                java.lang.Object r5 = r10.result
                X.Hji r3 = X.EnumC10460Hji.A02
                int r1 = r10.label
                r4 = 0
                r0 = 1
                if (r1 == 0) goto L2d
                if (r1 != r0) goto L28
                long r7 = r10.J$0
                goto L44
            L22:
                com.facebook.aura.commands.contacts.ContactsDataSource$ContactsBackfillStrategy$page$1 r10 = new com.facebook.aura.commands.contacts.ContactsDataSource$ContactsBackfillStrategy$page$1
                r10.<init>(r9, r13)
                goto L13
            L28:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L2d:
                X.Hwg.A00(r5)
                com.facebook.aura.commands.contacts.DeviceContactsReader r5 = com.facebook.aura.commands.contacts.DeviceContactsReader.INSTANCE     // Catch: java.lang.Exception -> L80 java.util.concurrent.CancellationException -> L93
                android.app.Application r6 = X.C4JM.A00()     // Catch: java.lang.Exception -> L80 java.util.concurrent.CancellationException -> L93
                r10.J$0 = r7     // Catch: java.lang.Exception -> L80 java.util.concurrent.CancellationException -> L93
                r9 = r12
                r10.I$0 = r12     // Catch: java.lang.Exception -> L80 java.util.concurrent.CancellationException -> L93
                r10.label = r0     // Catch: java.lang.Exception -> L80 java.util.concurrent.CancellationException -> L93
                java.lang.Object r5 = r5.readContactPage(r6, r7, r9, r10)     // Catch: java.lang.Exception -> L80 java.util.concurrent.CancellationException -> L93
                if (r5 != r3) goto L47
                return r3
            L44:
                X.Hwg.A00(r5)     // Catch: java.lang.Exception -> L80 java.util.concurrent.CancellationException -> L93
            L47:
                com.facebook.aura.commands.contacts.DeviceContactsReader$ContactPage r5 = (com.facebook.aura.commands.contacts.DeviceContactsReader.ContactPage) r5     // Catch: java.lang.Exception -> L80 java.util.concurrent.CancellationException -> L93
                java.util.List<com.facebook.aura.commands.contacts.CanonicalContact> r0 = r5.contacts
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L76
                X.2nw r3 = X.C7qW.A02()
                X.C7qW.A0C(r3)
                X.7pd r2 = X.C7pd.A01()
                java.util.List<com.facebook.aura.commands.contacts.CanonicalContact> r0 = r5.contacts
                java.util.Iterator r1 = r0.iterator()
            L62:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L6c
                X.C7pd.A04(r1, r2)
                goto L62
            L6c:
                kotlinx.serialization.json.JsonArray r1 = X.C7pd.A00(r2)
                java.lang.String r0 = "contacts"
                kotlinx.serialization.json.JsonObject r4 = X.C60O.A1I(r0, r1, r3)
            L76:
                long r1 = r5.lastId
                boolean r0 = r5.hasMore
                com.facebook.aura.nodes.datasource.BackfillPage r3 = new com.facebook.aura.nodes.datasource.BackfillPage
                r3.<init>(r4, r1, r0)
                return r3
            L80:
                r3 = move-exception
                java.lang.String r2 = r3.getMessage()
                java.lang.String r1 = "contacts backfill page read failed after="
                java.lang.String r0 = ": "
                java.lang.String r1 = X.FGI.A0L(r1, r7, r0, r2)
                java.lang.String r0 = "ContactsDataSource"
                X.CFK.A0A(r0, r1, r3)
                return r4
            L93:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.contacts.ContactsDataSource.ContactsBackfillStrategy.page(long, int, X.HtJ):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
        @Override // com.facebook.aura.nodes.datasource.PagedBackfillStrategy
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object estimatedChunks(X.HtJ<? super java.lang.Integer> r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof com.facebook.aura.commands.contacts.ContactsDataSource$ContactsBackfillStrategy$estimatedChunks$1
                if (r0 == 0) goto L1e
                r4 = r6
                com.facebook.aura.commands.contacts.ContactsDataSource$ContactsBackfillStrategy$estimatedChunks$1 r4 = (com.facebook.aura.commands.contacts.ContactsDataSource$ContactsBackfillStrategy$estimatedChunks$1) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L1e
                int r2 = r2 - r1
                r4.label = r2
            L12:
                java.lang.Object r1 = r4.result
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r4.label
                r2 = 1
                if (r0 == 0) goto L29
                if (r0 != r2) goto L24
                goto L3b
            L1e:
                com.facebook.aura.commands.contacts.ContactsDataSource$ContactsBackfillStrategy$estimatedChunks$1 r4 = new com.facebook.aura.commands.contacts.ContactsDataSource$ContactsBackfillStrategy$estimatedChunks$1
                r4.<init>(r5, r6)
                goto L12
            L24:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L29:
                X.Hwg.A00(r1)
                com.facebook.aura.commands.contacts.DeviceContactsReader r1 = com.facebook.aura.commands.contacts.DeviceContactsReader.INSTANCE     // Catch: java.lang.Exception -> L51 java.util.concurrent.CancellationException -> L66
                android.app.Application r0 = X.C4JM.A00()     // Catch: java.lang.Exception -> L51 java.util.concurrent.CancellationException -> L66
                r4.label = r2     // Catch: java.lang.Exception -> L51 java.util.concurrent.CancellationException -> L66
                java.lang.Object r1 = r1.countContacts(r0, r4)     // Catch: java.lang.Exception -> L51 java.util.concurrent.CancellationException -> L66
                if (r1 != r3) goto L3e
                return r3
            L3b:
                X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L51 java.util.concurrent.CancellationException -> L66
            L3e:
                int r1 = X.AnonymousClass001.A0F(r1)     // Catch: java.lang.Exception -> L51 java.util.concurrent.CancellationException -> L66
                int r0 = r5.getPageSize()
                int r1 = r1 + r0
                int r1 = r1 - r2
                int r1 = r1 / r0
                if (r1 >= r2) goto L4c
                r1 = 1
            L4c:
                java.lang.Integer r3 = X.C3cG.A0R(r1)
                return r3
            L51:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                java.lang.String r0 = "contacts count failed; estimating one chunk: "
                java.lang.String r1 = X.FGI.A0M(r0, r1)
                java.lang.String r0 = "ContactsDataSource"
                X.CFK.A06(r0, r1)
                java.lang.Integer r0 = X.C3cG.A0R(r2)
                return r0
            L66:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.contacts.ContactsDataSource.ContactsBackfillStrategy.estimatedChunks(X.HtJ):java.lang.Object");
        }

        @Override // com.facebook.aura.nodes.datasource.PagedBackfillStrategy
        public int getPageSize() {
            return this.pageSize;
        }

        @Override // com.facebook.aura.nodes.datasource.PagedBackfillStrategy
        public JsonObject ackStub() {
            C2nw c2nwA02 = C7qW.A02();
            C7qW.A0C(c2nwA02);
            return C60O.A1I(HatchNodeCardJsonKt.TYPE_CONTACTS, C7pd.A00(C7pd.A01()), c2nwA02);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.contacts.ContactsDataSource$backfill$2", f = "ContactsDataSource.kt", l = {102}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.contacts.ContactsDataSource$backfill$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super DataSourceResult>, Object> {
        public final /* synthetic */ DataSourceContext $ctx;
        public final /* synthetic */ String $endDate;
        public final /* synthetic */ String $startDate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DataSourceContext dataSourceContext, String str, String str2, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$ctx = dataSourceContext;
            this.$startDate = str;
            this.$endDate = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$ctx, this.$startDate, this.$endDate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                DataSourcePublishPipeline dataSourcePublishPipeline = DataSourcePublishPipeline.INSTANCE;
                DataSourceContext dataSourceContext = this.$ctx;
                String sourceId = ContactsDataSource.INSTANCE.getSourceId();
                String str = this.$startDate;
                if (str == null) {
                    str = "";
                }
                String str2 = this.$endDate;
                String str3 = str2 != null ? str2 : "";
                ContactsBackfillStrategy contactsBackfillStrategy = new ContactsBackfillStrategy();
                this.label = 1;
                obj = dataSourcePublishPipeline.deliverPaged(dataSourceContext, sourceId, str, str3, contactsBackfillStrategy, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super DataSourceResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.contacts.ContactsDataSource", f = "ContactsDataSource.kt", l = {246}, m = "isUntouchedSinceLastWalk", v = 2)
    /* renamed from: com.facebook.aura.commands.contacts.ContactsDataSource$isUntouchedSinceLastWalk$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContactsDataSource.this.isUntouchedSinceLastWalk(null, null, 0, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.contacts.ContactsDataSource$proactiveSync$2", f = "ContactsDataSource.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.contacts.ContactsDataSource$proactiveSync$2, reason: invalid class name and case insensitive filesystem */
    public final class C111102 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super DataSourceResult>, Object> {
        public final /* synthetic */ DataSourceContext $ctx;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111102(DataSourceContext dataSourceContext, HtJ<? super C111102> htJ) {
            super(2, htJ);
            this.$ctx = dataSourceContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C111102(this.$ctx, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super DataSourceResult> htJ) {
            return new C111102(this.$ctx, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ContactsDataSource contactsDataSource = ContactsDataSource.INSTANCE;
                DataSourceContext dataSourceContext = this.$ctx;
                this.label = 1;
                obj = contactsDataSource.runDeltaSync(dataSourceContext, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.contacts.ContactsDataSource", f = "ContactsDataSource.kt", l = {127, 139, 154, 173, 207}, m = "runDeltaSync", v = 2)
    /* renamed from: com.facebook.aura.commands.contacts.ContactsDataSource$runDeltaSync$1, reason: invalid class name and case insensitive filesystem */
    public final class C111111 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public C111111(HtJ<? super C111111> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContactsDataSource.this.runDeltaSync(null, this);
        }
    }

    static {
        Uri uri = ContactsContract.Contacts.CONTENT_URI;
        C7384Etj.A0V(uri);
        proactiveTrigger = new ProactiveTrigger.ContentObserver(uri, true, 2000L);
    }

    private final void commitWalkWatermark(NodeSyncBaselineStore nodeSyncBaselineStore, long j, int i) {
        nodeSyncBaselineStore.commit(WALK_WATERMARK_DATATYPE, new NodeSyncBaselineStore.Baseline(BASELINE_FINGERPRINT, AnonymousClass007.A0d(WALK_ROW_COUNT_KEY, String.valueOf(i), C3cG.A0r(WALK_WATERMARK_KEY, String.valueOf(j))), null, 4, null));
    }

    private final String contentHash(CanonicalContact canonicalContact) {
        return BQG.A17(NodeSyncDiff.INSTANCE.canonicalHash(canonicalContact.toJson()), 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isUntouchedSinceLastWalk(android.content.Context r8, com.facebook.aura.nodes.datasource.NodeSyncBaselineStore r9, int r10, X.HtJ<? super java.lang.Boolean> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.facebook.aura.commands.contacts.ContactsDataSource.AnonymousClass1
            if (r0 == 0) goto L1f
            r4 = r11
            com.facebook.aura.commands.contacts.ContactsDataSource$isUntouchedSinceLastWalk$1 r4 = (com.facebook.aura.commands.contacts.ContactsDataSource.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r5 = 1
            r7 = 0
            if (r0 == 0) goto L2a
            if (r0 != r5) goto L25
            goto L75
        L1f:
            com.facebook.aura.commands.contacts.ContactsDataSource$isUntouchedSinceLastWalk$1 r4 = new com.facebook.aura.commands.contacts.ContactsDataSource$isUntouchedSinceLastWalk$1
            r4.<init>(r11)
            goto L12
        L25:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2a:
            X.Hwg.A00(r1)
            java.lang.String r0 = "contacts_probe"
            com.facebook.aura.nodes.datasource.NodeSyncBaselineStore$Baseline r0 = r9.read(r0)
            if (r0 == 0) goto L93
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.hashes
            if (r1 == 0) goto L93
            java.lang.String r0 = "last_walk_ms"
            java.lang.String r0 = X.C60O.A0p(r0, r1)
            if (r0 == 0) goto L93
            java.lang.Long r0 = X.C9tI.A0s(r0)
            if (r0 == 0) goto L93
            long r2 = r0.longValue()
            java.lang.String r0 = "contact_row_count"
            java.lang.String r0 = X.C60O.A0p(r0, r1)
            if (r0 == 0) goto L93
            java.lang.Integer r0 = X.C9tI.A0r(r0)
            if (r0 == 0) goto L93
            int r0 = r0.intValue()
            if (r0 != r10) goto L93
            com.facebook.aura.commands.contacts.DeviceContactsReader r1 = com.facebook.aura.commands.contacts.DeviceContactsReader.INSTANCE     // Catch: java.util.concurrent.CancellationException -> L81 java.lang.Exception -> L83
            r0 = 0
            r4.L$0 = r0     // Catch: java.util.concurrent.CancellationException -> L81 java.lang.Exception -> L83
            r4.L$1 = r0     // Catch: java.util.concurrent.CancellationException -> L81 java.lang.Exception -> L83
            r4.L$2 = r0     // Catch: java.util.concurrent.CancellationException -> L81 java.lang.Exception -> L83
            r4.I$0 = r10     // Catch: java.util.concurrent.CancellationException -> L81 java.lang.Exception -> L83
            r4.J$0 = r2     // Catch: java.util.concurrent.CancellationException -> L81 java.lang.Exception -> L83
            r4.label = r5     // Catch: java.util.concurrent.CancellationException -> L81 java.lang.Exception -> L83
            java.lang.Object r1 = r1.countContactsChangedSince(r8, r2, r4)     // Catch: java.util.concurrent.CancellationException -> L81 java.lang.Exception -> L83
            if (r1 != r6) goto L78
            return r6
        L75:
            X.Hwg.A00(r1)     // Catch: java.util.concurrent.CancellationException -> L81 java.lang.Exception -> L83
        L78:
            int r0 = X.AnonymousClass001.A0F(r1)     // Catch: java.util.concurrent.CancellationException -> L81 java.lang.Exception -> L83
            if (r0 == 0) goto L7f
            r5 = 0
        L7f:
            r7 = r5
            goto L93
        L81:
            r0 = move-exception
            throw r0
        L83:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "contacts change probe failed; falling through to a full walk: "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "ContactsDataSource"
            X.CFK.A06(r0, r1)
        L93:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.contacts.ContactsDataSource.isUntouchedSinceLastWalk(android.content.Context, com.facebook.aura.nodes.datasource.NodeSyncBaselineStore, int, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0326, code lost:
    
        if (r2 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x017e, code lost:
    
        if (r14 == r29) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x019c, code lost:
    
        if (X.AnonymousClass001.A1X(r14) != false) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a0  */
    /* JADX WARN: Type inference failed for: r34v0, types: [com.facebook.aura.commands.contacts.ContactsDataSource] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0278 -> B:70:0x0279). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x02a0 -> B:73:0x0292). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runDeltaSync(com.facebook.aura.nodes.datasource.DataSourceContext r35, X.HtJ<? super com.facebook.aura.nodes.datasource.DataSourceResult> r36) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.contacts.ContactsDataSource.runDeltaSync(com.facebook.aura.nodes.datasource.DataSourceContext, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nodes.registry.HatchDataSourceRegistration
    public DataSource getDataSource() {
        return this;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public String getDescription() {
        return description;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public boolean getEmitsProactively() {
        return emitsProactively;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public List<String> getPermissionRequired() {
        return permissionRequired;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public /* bridge */ ProactiveDelivery getProactiveDelivery() {
        return ProactiveDelivery.DURABLE;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public ProactiveTrigger getProactiveTrigger() {
        return proactiveTrigger;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public String getSourceId() {
        return sourceId;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public boolean getSupportsBackfill() {
        return supportsBackfill;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public /* bridge */ boolean isEnabled() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object publishDelta(DataSourceContext dataSourceContext, List<CanonicalContact> list, List<CanonicalContact> list2, List<String> list3, HtJ<? super Boolean> htJ) {
        C2nw c2nwA02 = C7qW.A02();
        C7qW.A0C(c2nwA02);
        C7pd c7pdA01 = C7pd.A01();
        Iterator<CanonicalContact> it = list.iterator();
        while (it.hasNext()) {
            C7pd.A04(it, c7pdA01);
        }
        c2nwA02.A01("added", C7pd.A00(c7pdA01));
        C7pd c7pdA012 = C7pd.A01();
        Iterator<CanonicalContact> it2 = list2.iterator();
        while (it2.hasNext()) {
            C7pd.A04(it2, c7pdA012);
        }
        c2nwA02.A01("updated", C7pd.A00(c7pdA012));
        C7pd c7pdA013 = C7pd.A01();
        Iterator<String> it3 = list3.iterator();
        while (it3.hasNext()) {
            c7pdA013.A06(C7qW.A01("platformId", AnonymousClass005.A0j(it3), C60O.A1K()));
        }
        return dataSourceContext.publish(getSourceId(), C60O.A1I("removed", C7pd.A00(c7pdA013), c2nwA02), htJ);
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public Object backfill(String str, String str2, DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(dataSourceContext, str, str2, null));
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public Object proactiveSync(DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C111102(dataSourceContext, null));
    }
}
