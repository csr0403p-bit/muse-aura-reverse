package com.facebook.aura.commands.sms;

import X.AbstractC06907md;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C0881AGi;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7BY;
import X.CFK;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class DeviceContactResolver {
    public static final DeviceContactResolver INSTANCE = new DeviceContactResolver();

    @DebugMetadata(c = "com.facebook.aura.commands.sms.DeviceContactResolver$resolvePhoneNumbers$2", f = "DeviceContactResolver.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.sms.DeviceContactResolver$resolvePhoneNumbers$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends String>>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $name;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$name = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$context, this.$name, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (this.$context.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                return null;
            }
            ContentResolver contentResolver = this.$context.getContentResolver();
            LinkedHashSet linkedHashSetA0k = C3cG.A0k();
            try {
                Cursor cursorQuery = contentResolver.query(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_FILTER_URI, Uri.encode(this.$name)), new String[]{"_id"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
                        while (cursorQuery.moveToNext()) {
                            linkedHashSetA0k.add(C3cG.A0S(cursorQuery.getLong(columnIndexOrThrow)));
                        }
                        cursorQuery.close();
                    } finally {
                    }
                }
                if (linkedHashSetA0k.isEmpty()) {
                    return C0881AGi.A00;
                }
                String strA0r = C60O.A0r("contact_id IN (", AbstractC06907md.A01(",", linkedHashSetA0k, DeviceContactResolver$resolvePhoneNumbers$2$placeholders$1.INSTANCE));
                ArrayList arrayListA0i = AnonymousClass003.A0i(linkedHashSetA0k);
                Iterator it = linkedHashSetA0k.iterator();
                while (it.hasNext()) {
                    arrayListA0i.add(String.valueOf(C3cG.A05(it.next())));
                }
                String[] strArr = (String[]) arrayListA0i.toArray(new String[0]);
                LinkedHashSet linkedHashSetA0k2 = C3cG.A0k();
                try {
                    cursorQuery = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data1"}, strA0r, strArr, null);
                    if (cursorQuery != null) {
                        try {
                            int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("data1");
                            while (cursorQuery.moveToNext()) {
                                String string = cursorQuery.getString(columnIndexOrThrow2);
                                if (string != null) {
                                    if (C7BY.A0j(string)) {
                                        string = null;
                                    }
                                    if (string != null) {
                                        linkedHashSetA0k2.add(string);
                                    }
                                }
                            }
                            cursorQuery.close();
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                } catch (Exception e) {
                    CFK.A08(DeviceContactResolverKt.TAG, "Failed to read phones for contacts", e);
                }
                return AbstractC0878AGe.A0X(linkedHashSetA0k2);
            } catch (Exception e2) {
                CFK.A08(DeviceContactResolverKt.TAG, "Failed to resolve contacts", e2);
                return C0881AGi.A00;
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super List<String>> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends String>> htJ) {
            return invoke2(c3ux, (HtJ<? super List<String>>) htJ);
        }
    }

    public final Object resolvePhoneNumbers(Context context, String str, HtJ<? super List<String>> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(context, str, null));
    }
}
