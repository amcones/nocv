package com.amcones.nocv.view;

import com.amcones.nocv.entity.NocvData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)

public class NocvDataView extends NocvData {
    private Integer page;
    private Integer limit;
}
