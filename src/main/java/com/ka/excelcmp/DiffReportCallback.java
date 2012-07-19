package com.ka.excelcmp;

public interface DiffReportCallback {
    public void reportDiffCell(CellPos c1, CellPos c2);
    public void reportExtraCell(boolean firstWb, CellPos c);
    public void reportWorkbooksDiffer(boolean differ);
}
