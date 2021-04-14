package com.tts.TechTalentTwitter.model;

import java.util.List;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@Entity
public class TweetDisplay {
	private User user;
	private String message;
	private String date;
	private List<Tag> tags;
}
