package com.sp.questionnaire.entity.view;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * Author:Xiaowanwan
 * Date:2018/9/16-18:22
 */
@Setter
@Getter
@ToString
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class AddPaperViewPaper {
    private String title;
    private String startTime;
    private String endTime;
    private Integer status;
    private List<AddPaperViewQuestion> questions;

}
