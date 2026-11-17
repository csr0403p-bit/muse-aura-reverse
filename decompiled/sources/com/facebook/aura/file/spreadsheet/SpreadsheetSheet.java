package com.facebook.aura.file.spreadsheet;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class SpreadsheetSheet extends C06G {
    public final String name;
    public final List<List<String>> rows;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpreadsheetSheet) {
                SpreadsheetSheet spreadsheetSheet = (SpreadsheetSheet) obj;
                if (!C7384Etj.areEqual(this.name, spreadsheetSheet.name) || !C7384Etj.areEqual(this.rows, spreadsheetSheet.rows)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpreadsheetSheet copy$default(SpreadsheetSheet spreadsheetSheet, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spreadsheetSheet.name;
        }
        if ((i & 2) != 0) {
            list = spreadsheetSheet.rows;
        }
        AnonymousClass003.A0u(str, list);
        return new SpreadsheetSheet(str, list);
    }

    public final String component1() {
        return this.name;
    }

    public final List<List<String>> component2() {
        return this.rows;
    }

    public final String getName() {
        return this.name;
    }

    public final List<List<String>> getRows() {
        return this.rows;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.rows, AnonymousClass001.A0G(this.name));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SpreadsheetSheet(String str, List<? extends List<String>> list) {
        AnonymousClass003.A0u(str, list);
        this.name = str;
        this.rows = list;
    }

    public final SpreadsheetSheet copy(String str, List<? extends List<String>> list) {
        AnonymousClass003.A0u(str, list);
        return new SpreadsheetSheet(str, list);
    }

    public String toString() {
        return super.toString();
    }
}
