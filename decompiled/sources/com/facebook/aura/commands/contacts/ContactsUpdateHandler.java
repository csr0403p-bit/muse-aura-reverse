package com.facebook.aura.commands.contacts;

import X.AGH;
import X.AIW;
import X.AbstractC07127nr;
import X.AbstractC0885AGm;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C0924AIa;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.F60;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.HxE;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class ContactsUpdateHandler implements HatchNodeCommandHandler {
    public static final ContactsUpdateHandler INSTANCE = new ContactsUpdateHandler();

    public final class ContactResolvedUpdate {
        public final ContactUpdateInput input;
        public final ContactWriteTarget target;

        public final ContactUpdateInput getInput() {
            return this.input;
        }

        public final ContactWriteTarget getTarget() {
            return this.target;
        }

        public ContactResolvedUpdate(ContactUpdateInput contactUpdateInput, ContactWriteTarget contactWriteTarget) {
            AnonymousClass003.A0u(contactUpdateInput, contactWriteTarget);
            this.input = contactUpdateInput;
            this.target = contactWriteTarget;
        }
    }

    public final class ContactUpdateInput {
        public final String displayName;
        public final String email;
        public final String emailLabel;
        public final boolean hasUpdateFields;
        public final String jobTitle;
        public final String note;
        public final String organization;
        public final String path;
        public final String phoneLabel;
        public final String phoneNumber;
        public final String platformId;
        public final Long rawContactId;

        public final String getDisplayName() {
            return this.displayName;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getEmailLabel() {
            return this.emailLabel;
        }

        public final boolean getHasUpdateFields() {
            return this.hasUpdateFields;
        }

        public final String getJobTitle() {
            return this.jobTitle;
        }

        public final String getNote() {
            return this.note;
        }

        public final String getOrganization() {
            return this.organization;
        }

        public final String getPath() {
            return this.path;
        }

        public final String getPhoneLabel() {
            return this.phoneLabel;
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final String getPlatformId() {
            return this.platformId;
        }

        public final Long getRawContactId() {
            return this.rawContactId;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ContactUpdateInput(java.lang.String r2, java.lang.String r3, java.lang.Long r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            /*
                r1 = this;
                r1.<init>()
                r1.path = r2
                r1.platformId = r3
                r1.rawContactId = r4
                r1.displayName = r5
                r1.phoneNumber = r6
                r1.phoneLabel = r7
                r1.email = r8
                r1.emailLabel = r9
                r1.organization = r10
                r1.jobTitle = r11
                r1.note = r12
                if (r5 != 0) goto L26
                if (r6 != 0) goto L26
                if (r8 != 0) goto L26
                if (r10 != 0) goto L26
                if (r11 != 0) goto L26
                r0 = 0
                if (r12 == 0) goto L27
            L26:
                r0 = 1
            L27:
                r1.hasUpdateFields = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.contacts.ContactsUpdateHandler.ContactUpdateInput.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
        }
    }

    public final class ContactUpdateResult {
        public final ContactUpdateInput input;
        public final ContactWriteTarget target;
        public final int updatedFieldCount;

        public final ContactUpdateInput getInput() {
            return this.input;
        }

        public final ContactWriteTarget getTarget() {
            return this.target;
        }

        public final int getUpdatedFieldCount() {
            return this.updatedFieldCount;
        }

        public ContactUpdateResult(ContactUpdateInput contactUpdateInput, ContactWriteTarget contactWriteTarget, int i) {
            AnonymousClass003.A0u(contactUpdateInput, contactWriteTarget);
            this.input = contactUpdateInput;
            this.target = contactWriteTarget;
            this.updatedFieldCount = i;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.contacts.ContactsUpdateHandler$execute$2", f = "ContactsUpdateHandler.kt", l = {57, 68, 89, 98}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.contacts.ContactsUpdateHandler$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NodeCommandResponse>, Object> {
        public final /* synthetic */ HatchNodeCommandContext $commandContext;
        public final /* synthetic */ NodeExecutionContext $ctx;
        public final /* synthetic */ String $paramsJson;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, NodeExecutionContext nodeExecutionContext, HatchNodeCommandContext hatchNodeCommandContext, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$paramsJson = str;
            this.$ctx = nodeExecutionContext;
            this.$commandContext = hatchNodeCommandContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$paramsJson, this.$ctx, this.$commandContext, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[Catch: Exception -> 0x00cc, TryCatch #0 {Exception -> 0x00cc, blocks: (B:38:0x00c6, B:39:0x00c9, B:17:0x0043, B:18:0x005d, B:20:0x0063, B:22:0x0079, B:27:0x0084, B:29:0x008a, B:34:0x0095, B:33:0x0093, B:26:0x0082, B:35:0x009e), top: B:55:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0093 A[Catch: Exception -> 0x00cc, TryCatch #0 {Exception -> 0x00cc, blocks: (B:38:0x00c6, B:39:0x00c9, B:17:0x0043, B:18:0x005d, B:20:0x0063, B:22:0x0079, B:27:0x0084, B:29:0x008a, B:34:0x0095, B:33:0x0093, B:26:0x0082, B:35:0x009e), top: B:55:0x000e }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 287
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.contacts.ContactsUpdateHandler.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NodeCommandResponse> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final Long findDataRowId(ContentResolver contentResolver, long j, String str) {
        Cursor cursorQuery = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"_id"}, "raw_contact_id = ? AND mimetype = ?", new String[]{String.valueOf(j), str}, "is_super_primary DESC, is_primary DESC, _id ASC");
        if (cursorQuery != null) {
            try {
                lValueOf = cursorQuery.moveToFirst() ? Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"))) : null;
                cursorQuery.close();
            } finally {
            }
        }
        return lValueOf;
    }

    private final ContactUpdateInput parseUpdateInput(JsonObject jsonObject, String str) {
        String strOptionalStringParam = ContactsWriteSupportKt.optionalStringParam(jsonObject, ContactsWriteSupportKt.CONTACT_PARAM_PLATFORM_ID);
        Long lLongParam = ContactsWriteSupportKt.longParam(jsonObject, ContactsWriteSupportKt.CONTACT_PARAM_RAW_CONTACT_ID);
        if (lLongParam == null || lLongParam.longValue() <= 0) {
            lLongParam = null;
        }
        return new ContactUpdateInput(str, strOptionalStringParam, lLongParam, ContactsWriteSupportKt.optionalStringParam(jsonObject, "display_name"), ContactsWriteSupportKt.optionalStringParam(jsonObject, "phone_number"), ContactsWriteSupportKt.optionalStringParam(jsonObject, "phone_label"), ContactsWriteSupportKt.optionalStringParam(jsonObject, "email"), ContactsWriteSupportKt.optionalStringParam(jsonObject, "email_label"), ContactsWriteSupportKt.optionalStringParam(jsonObject, "organization"), ContactsWriteSupportKt.optionalStringParam(jsonObject, "job_title"), ContactsWriteSupportKt.optionalStringParam(jsonObject, "note"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ContactUpdateInput> parseUpdateInputs(JsonObject jsonObject) {
        List<JsonObject> listObjectListParam = ContactsWriteSupportKt.objectListParam(jsonObject, "updates_json", "updates");
        if (listObjectListParam == null) {
            throw C60O.A0i("updates_json is required");
        }
        ArrayList<ContactUpdateInput> arrayListA0i = AnonymousClass003.A0i(listObjectListParam);
        int i = 0;
        for (JsonObject jsonObject2 : listObjectListParam) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            arrayListA0i.add(INSTANCE.parseUpdateInput(jsonObject2, C60Q.A0k("updates[", i)));
            i = i2;
        }
        if (arrayListA0i.isEmpty()) {
            throw C60O.A0i("At least one contact update is required.");
        }
        for (ContactUpdateInput contactUpdateInput : arrayListA0i) {
            String str = contactUpdateInput.path;
            String strA0M = str != null ? FGI.A0M(str, ".") : "";
            if (contactUpdateInput.platformId == null && contactUpdateInput.rawContactId == null) {
                throw C60O.A0i(FGI.A0d(strA0M, "platform_id or ", strA0M, "raw_contact_id is required. Use platformId from the contacts data source, or raw_contact_id returned by contacts.create."));
            }
            if (!contactUpdateInput.hasUpdateFields) {
                if (str == null) {
                    str = "the contact";
                }
                throw C60Q.A0V("At least one contact field to update is required for ", str, ".");
            }
        }
        return arrayListA0i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void upsertData$default(ContactsUpdateHandler contactsUpdateHandler, List list, ContentResolver contentResolver, long j, String str, Map map, Map map2, int i, Object obj) {
        if ((i & 16) != 0) {
            map2 = AGH.A0E();
        }
        contactsUpdateHandler.upsertData(list, contentResolver, j, str, map, map2);
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.CONTACTS_UPDATE;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public HatchNodeCommandHandler getHandler() {
        return this;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean getOnlySendsCard() {
        return false;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandSpec getSpec() {
        return ContactsCommandSpecs.CONTACTS_UPDATE;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ String validateParams(String str) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ContactResolvedUpdate> resolveUpdateTargets(Context context, List<ContactUpdateInput> list) {
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (ContactUpdateInput contactUpdateInput : list) {
            ContactWriteTarget contactWriteTargetResolveContactWriteTarget = ContactsWriteSupportKt.resolveContactWriteTarget(context, contactUpdateInput.platformId, contactUpdateInput.rawContactId);
            if (contactWriteTargetResolveContactWriteTarget == null) {
                String str = contactUpdateInput.path;
                if (str == null) {
                    str = "the contact";
                }
                throw C60Q.A0V("Contact not found for ", str, ". Refresh the contacts data source and retry with a current platformId.");
            }
            arrayListA0i.add(new ContactResolvedUpdate(contactUpdateInput, contactWriteTargetResolveContactWriteTarget));
        }
        return arrayListA0i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ContactUpdateResult> updateContacts(Context context, List<ContactResolvedUpdate> list) throws RemoteException, OperationApplicationException {
        int i;
        ContentResolver contentResolver = context.getContentResolver();
        ArrayList<ContentProviderOperation> arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (ContactResolvedUpdate contactResolvedUpdate : list) {
            ContactWriteTarget contactWriteTarget = contactResolvedUpdate.target;
            ContactUpdateInput contactUpdateInput = contactResolvedUpdate.input;
            String str = contactUpdateInput.displayName;
            if (str != null) {
                ContactsUpdateHandler contactsUpdateHandler = INSTANCE;
                C7384Etj.A0X(contentResolver);
                contactsUpdateHandler.upsertData(arrayListA0h, contentResolver, contactWriteTarget.rawContactId, "vnd.android.cursor.item/name", AnonymousClass006.A10("data1", str), AGH.A0E());
                i = 1;
            } else {
                i = 0;
            }
            String str2 = contactUpdateInput.phoneNumber;
            if (str2 != null) {
                C0924AIa c0924AIaA0u = C3cG.A0u();
                c0924AIaA0u.put("data1", str2);
                String str3 = contactUpdateInput.phoneLabel;
                if (str3 != null) {
                    HxE<Integer, String> hxEPhoneTypeAndLabel = ContactsWriteSupportKt.phoneTypeAndLabel(str3);
                    int iA0F = AnonymousClass001.A0F(hxEPhoneTypeAndLabel.first);
                    String str4 = hxEPhoneTypeAndLabel.second;
                    c0924AIaA0u.put("data2", Integer.valueOf(iA0F));
                    c0924AIaA0u.put("data3", str4);
                }
                C0924AIa c0924AIaA0K = AIW.A0K(c0924AIaA0u);
                ContactsUpdateHandler contactsUpdateHandler2 = INSTANCE;
                C7384Etj.A0X(contentResolver);
                contactsUpdateHandler2.upsertData(arrayListA0h, contentResolver, contactWriteTarget.rawContactId, "vnd.android.cursor.item/phone_v2", c0924AIaA0K, AnonymousClass006.A10("data2", 2));
                i++;
            }
            String str5 = contactUpdateInput.email;
            if (str5 != null) {
                C0924AIa c0924AIaA0u2 = C3cG.A0u();
                c0924AIaA0u2.put("data1", str5);
                String str6 = contactUpdateInput.emailLabel;
                if (str6 != null) {
                    HxE<Integer, String> hxEEmailTypeAndLabel = ContactsWriteSupportKt.emailTypeAndLabel(str6);
                    int iA0F2 = AnonymousClass001.A0F(hxEEmailTypeAndLabel.first);
                    String str7 = hxEEmailTypeAndLabel.second;
                    c0924AIaA0u2.put("data2", Integer.valueOf(iA0F2));
                    c0924AIaA0u2.put("data3", str7);
                }
                C0924AIa c0924AIaA0K2 = AIW.A0K(c0924AIaA0u2);
                ContactsUpdateHandler contactsUpdateHandler3 = INSTANCE;
                C7384Etj.A0X(contentResolver);
                contactsUpdateHandler3.upsertData(arrayListA0h, contentResolver, contactWriteTarget.rawContactId, "vnd.android.cursor.item/email_v2", c0924AIaA0K2, AnonymousClass006.A10("data2", 1));
                i++;
            }
            String str8 = contactUpdateInput.organization;
            if (str8 != null || contactUpdateInput.jobTitle != null) {
                C0924AIa c0924AIaA0u3 = C3cG.A0u();
                if (str8 != null) {
                    c0924AIaA0u3.put("data1", str8);
                }
                String str9 = contactUpdateInput.jobTitle;
                if (str9 != null) {
                    c0924AIaA0u3.put("data4", str9);
                }
                c0924AIaA0u3.put("data2", 1);
                C0924AIa c0924AIaA0K3 = AIW.A0K(c0924AIaA0u3);
                ContactsUpdateHandler contactsUpdateHandler4 = INSTANCE;
                C7384Etj.A0X(contentResolver);
                contactsUpdateHandler4.upsertData(arrayListA0h, contentResolver, contactWriteTarget.rawContactId, "vnd.android.cursor.item/organization", c0924AIaA0K3, AGH.A0E());
                i++;
            }
            String str10 = contactUpdateInput.note;
            if (str10 != null) {
                ContactsUpdateHandler contactsUpdateHandler5 = INSTANCE;
                C7384Etj.A0X(contentResolver);
                contactsUpdateHandler5.upsertData(arrayListA0h, contentResolver, contactWriteTarget.rawContactId, "vnd.android.cursor.item/note", AnonymousClass006.A10("data1", str10), AGH.A0E());
                i++;
            }
            arrayListA0h2.add(new ContactUpdateResult(contactUpdateInput, contactWriteTarget, i));
        }
        if (arrayListA0h.isEmpty()) {
            throw C3cG.A0Q("No update operations were generated");
        }
        contentResolver.applyBatch("com.android.contacts", arrayListA0h);
        return arrayListA0h2;
    }

    private final void upsertData(List<ContentProviderOperation> list, ContentResolver contentResolver, long j, String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        ContentProviderOperation.Builder builderWithValue;
        Long lFindDataRowId = findDataRowId(contentResolver, j, str);
        Uri uri = ContactsContract.Data.CONTENT_URI;
        if (lFindDataRowId != null) {
            builderWithValue = ContentProviderOperation.newUpdate(uri).withSelection("_id = ?", C60Q.A1a(lFindDataRowId.longValue()));
        } else {
            builderWithValue = ContentProviderOperation.newInsert(uri).withValue(ContactsWriteSupportKt.CONTACT_PARAM_RAW_CONTACT_ID, Long.valueOf(j)).withValue("mimetype", str);
            Iterator itA0n = AnonymousClass002.A0n(map2);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                builderWithValue.withValue(C60O.A0t(entryA0l), entryA0l.getValue());
            }
        }
        C7384Etj.A0X(builderWithValue);
        Iterator itA0n2 = AnonymousClass002.A0n(map);
        while (itA0n2.hasNext()) {
            Map.Entry entryA0l2 = C3cH.A0l(itA0n2);
            builderWithValue.withValue(C60O.A0t(entryA0l2), entryA0l2.getValue());
        }
        C60R.A0v(builderWithValue, list);
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public Object execute(AbstractC3358CGz abstractC3358CGz, HatchNodeCommandContext hatchNodeCommandContext, String str, NodeExecutionContext nodeExecutionContext, HtJ<? super NodeCommandResponse> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, nodeExecutionContext, hatchNodeCommandContext, null));
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ Object optionalDevicePermissions(String str, Context context, HtJ<? super List<String>> htJ) {
        return null;
    }
}
