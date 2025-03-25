s this a bug???, When I execute redirect in DeleteMapping, I get 405 error #44871
Open
@callor
Description
callor
opened now
When I execute redirect in DeleteMapping, I get 405 error

The code I tested is in the following repository:

https://github.com/callor/SpBoot-Redirect-issue.git

I created a very small project to reproduce the problem.

There is one Controller and three Mappings.

There are 2 GetMappings and 1 DeleteMapping.

In @DeleteMapping, after executing Delete, a redirect to /list is executed.

return "redirect:/list";
When accessing through a browser, redirection from @DeleteMapping to @GetMapping (/list) works well.

However, if you make an Ajax request using fetch, axios, htmx, etc., you will get a 405 result.

It looks like the redirect is switching from @GetMapping to @DeleteMapping

I want to solve some problem

![image](https://github.com/user-attachments/assets/bd8eb76b-bfc2-4fed-a525-d2f4f22cbaba)
