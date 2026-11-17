package com.facebook.aura.commands.contactlookup;

import X.A3q;
import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.CFK;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class ContactNameLookup {
    public static final ContactNameLookup INSTANCE = new ContactNameLookup();

    public final class ContactNames {
        public final Map<String, String> byAddress;
        public final Set<String> confirmedAbsent;

        public final Map<String, String> getByAddress() {
            return this.byAddress;
        }

        public final Set<String> getConfirmedAbsent() {
            return this.confirmedAbsent;
        }

        public ContactNames(Map<String, String> map, Set<String> set) {
            AnonymousClass003.A0u(map, set);
            this.byAddress = map;
            this.confirmedAbsent = set;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.contactlookup.ContactNameLookup$lookup$2", f = "ContactNameLookup.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.contactlookup.ContactNameLookup$lookup$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ContactNames>, Object> {
        public final /* synthetic */ List<String> $addresses;
        public final /* synthetic */ Context $context;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, List<String> list, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$addresses = list;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$context, this.$addresses, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r2v2, types: [X.A3q] */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r3v2, types: [X.9jH] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ?? A0j;
            ?? A0k;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (ContactNameLookup.INSTANCE.isReadable(this.$context)) {
                ContentResolver contentResolver = this.$context.getContentResolver();
                A0j = C3cG.A0j();
                A0k = C3cG.A0k();
                Iterator it = AbstractC0878AGe.A0T(this.$addresses).iterator();
                while (it.hasNext()) {
                    String strA0j = AnonymousClass005.A0j(it);
                    if (!C7BY.A0j(strA0j)) {
                        try {
                            Cursor cursorQuery = contentResolver.query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(strA0j)), new String[]{"display_name"}, null, null, null);
                            if (cursorQuery == null) {
                                CFK.A04(ContactNameLookupKt.TAG, "PhoneLookup returned no cursor");
                            } else {
                                try {
                                    if (cursorQuery.moveToFirst()) {
                                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("display_name"));
                                        if (string != null && !C7BY.A0j(string)) {
                                            A0j.put(strA0j, string);
                                        }
                                    } else {
                                        A0k.add(strA0j);
                                    }
                                    cursorQuery.close();
                                } finally {
                                }
                            }
                        } catch (Exception e) {
                            CFK.A08(ContactNameLookupKt.TAG, "PhoneLookup failed", e);
                        }
                    }
                }
            } else {
                A0j = AGH.A0E();
                A0k = A3q.A00;
            }
            return new ContactNames(A0j, A0k);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ContactNames> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.contactlookup.ContactNameLookup", f = "ContactNameLookup.kt", l = {100}, m = "nameFor", v = 2)
    /* renamed from: com.facebook.aura.commands.contactlookup.ContactNameLookup$nameFor$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContactNameLookup.this.nameFor(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.contactlookup.ContactNameLookup", f = "ContactNameLookup.kt", l = {96}, m = "namesFor", v = 2)
    /* renamed from: com.facebook.aura.commands.contactlookup.ContactNameLookup$namesFor$1, reason: invalid class name and case insensitive filesystem */
    public final class C111091 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C111091(HtJ<? super C111091> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContactNameLookup.this.namesFor(null, null, this);
        }
    }

    public final boolean isReadable(Context context) {
        C7384Etj.A0Y(context, 0);
        return context.checkSelfPermission(AnonymousClass000.A00(28)) == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object nameFor(android.content.Context r6, java.lang.String r7, X.HtJ<? super java.lang.String> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.commands.contactlookup.ContactNameLookup.AnonymousClass1
            if (r0 == 0) goto L3e
            r4 = r8
            com.facebook.aura.commands.contactlookup.ContactNameLookup$nameFor$1 r4 = (com.facebook.aura.commands.contactlookup.ContactNameLookup.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L44
            java.lang.Object r7 = r4.L$1
            X.Hwg.A00(r1)
        L22:
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r1.get(r7)
            return r0
        L29:
            X.Hwg.A00(r1)
            java.util.List r1 = java.util.Collections.singletonList(r7)
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r7
            r4.label = r2
            java.lang.Object r1 = r5.namesFor(r6, r1, r4)
            if (r1 != r3) goto L22
            return r3
        L3e:
            com.facebook.aura.commands.contactlookup.ContactNameLookup$nameFor$1 r4 = new com.facebook.aura.commands.contactlookup.ContactNameLookup$nameFor$1
            r4.<init>(r8)
            goto L12
        L44:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.contactlookup.ContactNameLookup.nameFor(android.content.Context, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object namesFor(android.content.Context r6, java.util.List<java.lang.String> r7, X.HtJ<? super java.util.Map<java.lang.String, java.lang.String>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.commands.contactlookup.ContactNameLookup.C111091
            if (r0 == 0) goto L36
            r4 = r8
            com.facebook.aura.commands.contactlookup.ContactNameLookup$namesFor$1 r4 = (com.facebook.aura.commands.contactlookup.ContactNameLookup.C111091) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L36
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L25
            if (r0 != r1) goto L3c
            X.Hwg.A00(r3)
        L20:
            com.facebook.aura.commands.contactlookup.ContactNameLookup$ContactNames r3 = (com.facebook.aura.commands.contactlookup.ContactNameLookup.ContactNames) r3
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.byAddress
            return r0
        L25:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.label = r1
            java.lang.Object r3 = r5.lookup(r6, r7, r4)
            if (r3 != r2) goto L20
            return r2
        L36:
            com.facebook.aura.commands.contactlookup.ContactNameLookup$namesFor$1 r4 = new com.facebook.aura.commands.contactlookup.ContactNameLookup$namesFor$1
            r4.<init>(r8)
            goto L12
        L3c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.contactlookup.ContactNameLookup.namesFor(android.content.Context, java.util.List, X.HtJ):java.lang.Object");
    }

    public final Object lookup(Context context, List<String> list, HtJ<? super ContactNames> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(context, list, null));
    }
}
